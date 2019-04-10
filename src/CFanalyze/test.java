package CFanalyze;
public class test{
	public static void main(String args[]) {
		CFanalyze test =new CFanalyze();
		test.CFmain("int main(){\r\n" + 
				"int a=1;\r\n" + 
				"int b=2;\r\n" + 
				"int c=4;\r\n" + 
				"if (a>b){\r\n" + 
				"  b=a;\r\n" + 
				"}else{\r\n" + 
				"a=b;\r\n" + 
				"}\r\n" + 
				"while(a>0){\r\n" + 
				"b=b-1;\r\n" + 
				"a=a-1;\r\n" + 
				"}\r\n" + 
				"/*注释test*/\r\n" + 
				"}");
		
	}
}