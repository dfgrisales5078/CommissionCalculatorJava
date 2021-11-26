package com.diego;


// Since the SalesAssociate class is derived from Employee class,
// it inherits and has access to fields and functions from Employee class.

public class SalesAssociate extends Employee {

    // default constructor
    public SalesAssociate() { }

    // Initialization list constructor
    public SalesAssociate(String employee_name, double new_accounts_sold, double upgrades_sold, double accessories_sold,
                          int goal_reached)
    {
        m_employee_name = employee_name;
        m_new_accounts_sold = new_accounts_sold;
        m_upgrades_sold = upgrades_sold;
        m_accessories_sold = accessories_sold;
        m_goal_reached = goal_reached;
    }

    // SalesAssociate class method definitions:

    @Override
    public void SetNewAccountCommissions() {
        // goal 1 = $9, goal 2 = $7 (per phone)
        double commission_per_account;
        if (m_goal_reached == 1) {
            commission_per_account = 9;
        }
        else {
            commission_per_account = 7;
        }
        m_new_account_commissions = m_new_accounts_sold * commission_per_account;
    }

    @Override
    public void SetUpgradeCommissions() {
        m_upgrade_commissions = m_upgrades_sold * 6;
    }

    @Override
    public void SetAccessoryCommissions() {
        // goal 1 = 16%, goal 2 = 14% (of accessory sales)
        double percentage_of_sales;
        if (m_goal_reached == 1) {
            percentage_of_sales = 0.16;
        }
        else {
            percentage_of_sales = 0.14;
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
