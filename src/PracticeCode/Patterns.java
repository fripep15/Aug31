package PracticeCode;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Patterns {
/*     
    *
      **
     ***
    ****
   ***** 
  
  */
	public static void main(String[] args) {
	
		int row=8;
		int i;
		for (i=0;i<row ;i++) {
			
			for (int j=0; j<row-i;j++) {
				System.out.print("");
				
			}
			for (int k=0;k<i;k++) {
				System.out.print("  *");
			}
		System.out.println();
			}
		}
}
