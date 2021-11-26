package com.diego;


// Base class
// Employee is Abstract class, it cannot be instantiated since it contains pure virtual functions.
abstract class Employee {

    // protected fields can be accessed in superclass and subclasses (inheritance)
    protected String m_employee_name;
    protected double m_new_accounts_sold;
    protected double m_upgrades_sold;
    protected double m_accessories_sold;

    protected double m_new_account_commissions;
    protected double m_upgrade_commissions;
    protected double m_accessory_commissions;
    protected int m_goal_reached;

    protected double m_total_commissions;

    // default constructor
    public Employee() {}
    // Initialization list constructor
    public Employee(String employee_name, int new_accounts_sold, int upgrades_sold, double accessories_sold,
                    int goal_reached)
    {
        m_employee_name = employee_name;
        m_new_accounts_sold = new_accounts_sold;
        m_upgrades_sold = upgrades_sold;
        m_accessories_sold = accessories_sold;
        m_goal_reached = goal_reached;
    }

    // set methods
    public void SetEmployeeName(String name) {
        m_employee_name = name;
    }
    public void SetNewAccountsSold(int new_accounts) {
        m_new_accounts_sold = new_accounts;
    }
    public void SetUpgradesSold(int upgrades) {
        m_upgrades_sold = upgrades;
    }
    public void SetAccessoriesSold(double accessories) {
        m_accessories_sold = accessories;
    }
    public void SetGoalReached(int goal) {
        m_goal_reached = goal;
    }


    // Pure virtual methods - methods that exists only to be overwritten
    // Different definitions in Manager and SalesAssociate classes (polymorphism).
    abstract void SetNewAccountCommissions();

    abstract void SetUpgradeCommissions();

    abstract void SetAccessoryCommissions();


    public void SetTotalCommissions() {
        SetNewAccountCommissions();
        SetUpgradeCommissions();
        SetAccessoryCommissions();
        m_total_commissions = m_new_account_commissions + m_upgrade_commissions + m_accessory_commissions;
    }

    // get methods
    public String GetEmployeeName() {
        return m_employee_name;
    }
    public double GetNewAccountsSold() {
        return m_new_accounts_sold;
    }
    public double GetUpgradesSold() {
        return m_upgrades_sold;
    }
    public double GetAccessoriesSold() {
        return m_accessories_sold;
    }
    public int GetGoalReached() {
        return m_goal_reached;
    }
    public double GetNewAccountCommissions() {
        return m_new_account_commissions;
    }
    public double GetUpgradeCommissions() {
        return m_upgrade_commissions;
    }
    public double GetAccessoryCommissions() {
        return m_accessory_commissions;
    }
    // function defined in Employee.cpp file
    public void GetTotalCommissions() {
        SetTotalCommissions();

        System.out.println("Commission summary for: " + m_employee_name);
        System.out.println("New account commissions: $" + m_new_account_commissions);
        System.out.println("Upgrade commissions: $" + m_upgrade_commissions);
        System.out.println("Accessory commissions: $" + m_accessory_commissions);
        System.out.println("Total commissions: $" + m_total_commissions);
        System.out.println(" ");
    }
}
