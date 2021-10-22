package lec12_java_oop_inheritance_02;

public class TestFamilyHierarchy {

	public static void main(String[] args) {
		// classes are instantiated below
		
		Grandfather grandfather = new Grandfather(); // default constructor initialized
		Grandfather grandfather1 = new Grandfather("Ismail Sharkar", 100, 'M', false); // parameterized constructor initialize
		grandfather.grandfatherInfo(); //void type method initialize
		grandfather.grandfatherinfo("Ismail", 100, 'M', false); // parameterized method initialized
		
		Uncle uncle = new Uncle();
		uncle.uncleInfo();
		uncle.grandfatherInfo();
		
		Cousin2 cousin2 = new Cousin2();
		cousin2.cousin2Info();
		cousin2.uncleInfo();
		cousin2.grandfatherInfo();
		
		Aunt aunt = new Aunt();
		aunt.auntInfo();
		aunt.grandfatherInfo();
		
		Cousin1 cousin1 = new Cousin1();
		cousin1.cousin1Info();
		cousin1.auntInfo();
		cousin1.grandfatherInfo();
		
		
		Father father = new Father();
		father.fatherInfo();		
		father.grandfatherInfo();
		father.grandfatherinfo("Ismail Sharkar", 100, 'M', false); // PARAMETERIZED METHOD OF GRANDFATHER
		
		Sister sister = new Sister();
		sister.sisterInfo();	
		sister.fatherInfo();
		sister.grandfatherInfo();
		
		Niece niece = new Niece();
		niece.nieceInfo();
		niece.sisterInfo();
		niece.fatherInfo();
		niece.grandfatherInfo();
		
		GrandChildren grandChildren = new GrandChildren();
		grandChildren.grandchildrenInfo();
		grandChildren.nieceInfo();
		grandChildren.sisterInfo();
		grandChildren.fatherInfo();
		grandChildren.grandfatherInfo();
		
		
		Brother brother = new Brother();
		brother.brotherInfo();
		brother.fatherInfo();
		brother.grandfatherInfo();
		
		Nephew nephew = new Nephew();
		nephew.nephewInfo();
		nephew.brotherInfo();
		nephew.fatherInfo();
		nephew.grandfatherInfo();
		
		Me me = new Me();
		me.myInfo();
		me.fatherInfo();
		me.grandfatherInfo();
		
		Daughter daughter = new Daughter();
		daughter.daughterInfo();
		daughter.myInfo();
		daughter.fatherInfo();
		daughter.grandfatherInfo();
		
		
		
		
		
		
		

	}

}
