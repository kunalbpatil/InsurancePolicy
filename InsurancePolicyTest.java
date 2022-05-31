
public class InsurancePolicyTest {

	public static void main(String[] args) {
		InsurancePolicy obj1 = new InsurancePolicy();
		obj1.setPolicyDetails(123, "Kunal Patil", 300000, 200000);
		obj1.printPolicyDetails();
	}

}

class InsurancePolicy{
	int policyNumber;
	String policyHolderName;
	double sumInsured;
	double balance;
	
	
	public void setPolicyDetails(int policyNumber,String policyHolderName,double sumInsured,double balance) {
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.sumInsured = sumInsured;
		this.balance = balance;
	}
	
	public void printPolicyDetails() {
		System.out.println("Policy Number: "+policyNumber);
		System.out.println("Policy Holder Name: "+policyHolderName);
		System.out.println("Sum Insured Amount: "+sumInsured);
		System.out.println("Policy Balance: "+balance);
	}

	
}
