
package string;

public class StringDemo2 {
    public static void main(String[] args) {
       String n1 = ",Neyamotpur Sorkari Rejiya Prathomic Biddaloy";
       String n2 = ",Momotajmiyar Hat Meherrunnesa Dakhil Madrasha";
       String n3 = ",Dowlotpure Huq Bahadure High School";
       String n4 = ",Feni Residential Cadet Madrasha";
       String n5 = ",Ibn Taimiya School & Collage";
       String n6 = ",Daffodil International University";
       String n = n1.concat(n2);
       String upper = n1.toUpperCase();
        System.out.println("Upper Case = "+upper);
       String lower = n1.toLowerCase();
        System.out.println("Lower Case = "+lower);
        System.out.println(n);
       String everyStudyPlace = n1+n2+n3+n4+n5+n6;
        System.out.println(everyStudyPlace);
        boolean m = n1.startsWith(" ,");
        System.out.println(m);
    }
}
