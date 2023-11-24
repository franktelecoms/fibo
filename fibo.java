import java.util.*;

class test
{
	//inicializamos las variables
	int primero=0;   
	int anterior=0;
	int presente=1;
	int nuevo;


	public void test()

	{

		for(int i=0;i<10;i++)

		{
			// fuerzo la primera posicion con el 0
			if(i==0){System.out.println(primero);} 
			// nuevo  = 0+1                                  
			nuevo=anterior+presente;
			// anterior pasa de 0 a 1               
			anterior=presente; 
			// presente pasa a 1                    
			presente=nuevo;
			// imprimo la secuencia restante                        
			System.out.println(anterior);  
			// comparo posicion y numero         
			if(i==3&&anterior==3)                 
			{
				//imprime igualdad
		    System.out.println("correcto posicion 5 con numero 3"); 
			}


		}
	}




	public static void main(String[] args)
	{
		test tes = new test();                    
		//llamada a ejecucion
		tes.test();


	}
}

    //salidas programa
	//0
	//1
	//1
	//2
	//3
	//correcto posicion 5 con numero 3
    //5
    //8
    //13
    //21
    //34
    //55
