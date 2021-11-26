package com.diego;

public class Manager extends Employee {

    //default constructor
    public Manager() { }

    // Initialization list constructor
    public Manager(String employee_name, double new_accounts_sold, double upgrades_sold, double accessories_sold,
                   int goal_reached)
    {
        m_employee_name = employee_name;
        m_new_accounts_sold = new_accounts_sold;
        m_upgrades_sold = upgrades_sold;
        m_accessories_sold = accessories_sold;
        m_goal_reached = goal_reached;
    }


    // Manager class method definitions
    @Override
    public void SetNewAccountCommissions() {
        // goal 1 = $10, goal 2 = $8 (per phone)
        double commission_per_account;
        if (m_goal_reached == 1) {
            commission_per_account = 10;
        }
        else {
            commission_per_account = 8;
        }
        m_new_account_commissions = m_new_accounts_sold * commission_per_account;
    }

    @Override
    public void SetUpgradeCommissions() {
        m_upgrade_commissions = m_upgrades_sold * 7;
    }

    @Override
    public void SetAccessoryCommissions() {
        // goal 1 = 18%, goal 2 = 16% (of accessory sales)
        double percentage_of_sales;
        if (m_goal_reached == 1) {
            percentage_of_sales = 0.18;
        }
        else {
            percentage_of_sales = 0.16;
        }
        m_accessory_commissions = m_accessories_sold * percentage_of_sales;
    }

    public void SetTotalCommissions() {
        SetNewAccountCommissions();
        SetUpgradeCommissions();
        SetAccessoryCommissions();
        m_total_commissions = m_new_account_commissions + m_upgrade_commissions + m_accessory_commissions;
    }
}