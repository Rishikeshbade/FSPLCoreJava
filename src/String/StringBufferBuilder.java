package String;

public class StringBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("Rishikesh");
		sb.append(" Bade");
		System.out.println("StringBuffer: "+sb);
		
		System.out.println("--------------------------------------------------------");
		
		//StringBuffer s = new StringBuffer();
		//System.out.println("Capicity of StringBuffer: "+s.capacity());
		
		StringBuilder sb2 = new StringBuilder("Rishikesh");
		sb2.append(" Bade");
		System.out.println("StringBuilder: "+sb2);
		
		//StringBuilder s1 = new StringBuilder();
		//System.out.println("Capacity of String Builder: "+s1.capacity());
		

	}

}
