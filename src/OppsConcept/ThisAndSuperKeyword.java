package OppsConcept;

class Father {
    int a = 67;
}

class Son extends Father {
    int a = 20;

    void display() {
        System.out.println("Using This Keyword: " + this.a);        
        System.out.println("Using Super Keyword: " + super.a);    
    }
}

public class ThisAndSuperKeyword {
    public static void main(String[] args) {
        Son ob = new Son();
        ob.display();
    }
}

