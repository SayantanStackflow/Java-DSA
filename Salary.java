class Employee{
    double dAllowance, hrAllowance, mAllowance, basicSal;
    Employee(int b){
        dAllowance= 0.45;
        hrAllowance= 0.15;
        mAllowance= 500;
        basicSal= b;
    }
    double regularSalary(){
        return basicSal+(basicSal*dAllowance)+(basicSal*hrAllowance)+mAllowance;
    }
}
class Scientist extends Employee{
    double bonusperPub, noofPubs;
    Scientist(int b, int np){
        super(b);
        bonusperPub= 1000;
        noofPubs= np;
    }
    double netBonus(){
        return bonusperPub*noofPubs;
    }
    double netSalary(){
        return regularSalary()+netBonus();
    }
}
class Developer extends Employee{
    double bonusperPat, noofPats;
    Developer(int b, int np){
        super(b);
        bonusperPat= 5000;
        noofPats= np;
    }
    double netBonus(){
        return bonusperPat*noofPats;
    }
    double netSalary(){
        return regularSalary()+netBonus();
    }
}
class ProjectLeads extends Employee{
    double bonusperPro, noofPros;
    ProjectLeads(int b, int np){
        super(b);
        bonusperPro= 1000;
        noofPros= np;
    }
    double netBonus(){
        return bonusperPro*noofPros;
    }
    double netSalary(){
        return regularSalary()+netBonus();
    }
}
class Salary{
    public static void main(String[] args) {
        Scientist sc= new Scientist(100000, 5);
        double ScientistSalary= sc.netSalary();
        System.out.println("The net salary of the scientist is: "+ScientistSalary);

        Developer dev= new Developer(50000, 10);
        double DeveloperSalary= dev.netSalary();
        System.out.println("The net salary of the scientist is: "+DeveloperSalary);

        ProjectLeads lead= new ProjectLeads(20000, 8);
        double ProjectLeadsSalary= lead.netSalary();
        System.out.println("The net salary of the scientist is: "+ProjectLeadsSalary);
    }
}