package work.orchard.opw_timings;


import java.io.*;
import java.util.*;
import java.lang.*;

public class OPW 
{



	public static void main(String args[]) throws IOException
	{
		File file1 = new File("opw_id_start_end");
		File file2 = new File("opw_tables");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
		String line = null;
		HashMap<String,String> mp= new HashMap<String,String>();

		mp.put("[DWXTRACT_DXTMBRMONG]","ORX_INTK_5");
		mp.put("[DWXTRACT_DXTMBRMON]","ORX_INTK_5");
		mp.put("[DWXTRACT2_DXTMBRMONG]","ORX_INTK_5");
		mp.put("[DWXTRACT2_DXTMBRMON]","ORX_INTK_5");
		mp.put("[CLMPRDEXT2_RCEX4P]","ORX_INTK_5");
		mp.put("[CLMP02EXTG_RCEX4P]","ORX_INTK_5");
		mp.put("[DWXTRACT_WK_RXTCDL011]","ORX_INTK_5");
		mp.put("[DWXTRACT2_WK_RXTCDL011]","ORX_INTK_5");
		mp.put("[CLMP02FIL_RCPDEP]","ORX_INTK_6");
		mp.put("[CLMP02FIL_RCTCDP]","ORX_INTK_6");
		mp.put("[CLMP02FIL_RCDRDP]","ORX_INTK_6");
		mp.put("[CLMPRDFIL_RCPDEP]","ORX_INTK_6");
		mp.put("[CLMPRDFIL_RCTCDP]","ORX_INTK_6");
		mp.put("[ODSLIB_TAB3AD  ]","ORX_INTK_7");
		mp.put("[ODSLIB_TAB1AD]","ORX_INTK_7");
		mp.put("[PALIB_PAGP10]","ORX_INTK_7");
		mp.put("[CUSTLIB_RXAFCDP]","ORX_INTK_7");
		mp.put("[CUSTLIB_RXAFGRP]","ORX_INTK_7");
		mp.put("[CUSTLIB_RX32100P7]","ORX_INTK_7");
		mp.put("[CUSTLIB_RX10156F2]","ORX_INTK_7");
		mp.put("[DWDATA_DRGMAJGRP]","ORX_INTK_7");
		mp.put("[DWDATA_LU_SUBMITTED_DATE_ALL]","ORX_INTK_7");
		mp.put("[CLMP02FIL_RCGRPP]","ORX_INTK_8");
		mp.put("[CLMP02FIL_RCMEPP]","ORX_INTK_8");
		mp.put("[CLMP02FIL_RCMCFP]","ORX_INTK_8");
		mp.put("[CLMP02FIL_RCAGDP]","ORX_INTK_8");
		mp.put("[CLMP02FIL_RCGELP]","ORX_INTK_8");
		mp.put("[CLMP02FIL_RCMBRP]","ORX_INTK_8");
		mp.put("[CLMP02FIL_RCMELP]","ORX_INTK_8");
		mp.put("[CLMP02FIL_RCGCMP]","ORX_INTK_8");
		mp.put("[CLMP02FIL_RCMAIP]","ORX_INTK_8");
		mp.put("[CLMP02FIL_RCPDPP]","ORX_INTK_8");
		mp.put("[DWXTRACT2_XT_CARRIER_ACCOUNT_ORIG]","ORX_INTK_8");
		mp.put("[DWXTRACT2_XT_CARRIER_ID_ORIG]","ORX_INTK_8");
		mp.put("[DWXTRACT2_XT_SUPER_CARRIER]","ORX_INTK_8");
		mp.put("[CLMP02FIL_RCMSIP]","ORX_INTK_9");
		mp.put("[CLMP02FIL_RCCARP]","ORX_INTK_9");
		mp.put("[CLMP02FIL_RCCNWP]","ORX_INTK_9");
		mp.put("[CLMP02FIL_RCMMDP]","ORX_INTK_9");
		mp.put("[CLMP02FIL_RCAGFP]","ORX_INTK_9");
		mp.put("[CLMP02FIL_RCAMFP]","ORX_INTK_9");
		mp.put("[CLMP02FIL_RCACCP]","ORX_INTK_9");
		mp.put("[CLMP02FIL_RCGPSP]","ORX_INTK_9");
		mp.put("[CLMP02FIL_RCCFAP]","ORX_INTK_9");
		mp.put("[CLMP02FIL_RCAMDP]","ORX_INTK_9");
		mp.put("[DWXTRACT_XT_CARRIER_ACCOUNT_ORIG]","ORX_INTK_9");
		mp.put("[DWXTRACT_XT_CARRIER_ID_ORIG]","ORX_INTK_9");
		mp.put("[DWXTRACT_XT_SUPER_CARRIER]","ORX_INTK_9");
		mp.put("[CLMPRDFIL_PBPPCP]","ORX_INTK_10");
		mp.put("[CLMPRDFIL_UUBYREP]","ORX_INTK_10");
		mp.put("[CLMPRDFIL_RCSNHP]","ORX_INTK_10");
		mp.put("[CLMPRDFIL_RCREJP]","ORX_INTK_10");
		mp.put("[CLMPRDFIL_RCAHFP]","ORX_INTK_10");
		mp.put("[CLMPRDFIL_RCSNDP]","ORX_INTK_10");
		mp.put("[CLMPRDFIL_RCMEPP]","ORX_INTK_10");
		mp.put("[CLMPRDFIL_RCPRLP]","ORX_INTK_10");
		mp.put("[CLMPRDFIL_RCGELP]","ORX_INTK_10");
		mp.put("[CLMPRDFIL_RCMELP]","ORX_INTK_10");
		mp.put("[CLMPRDFIL_RCPFGP]","ORX_INTK_10");
		mp.put("[CLMPRDFIL_RCPFNP]","ORX_INTK_10");
		mp.put("[CLMPRDFIL_RCAMDP]","ORX_INTK_10");
		mp.put("[CLMPRDFIL_RCPDPP]","ORX_INTK_10");
		mp.put("[CLMPRDFIL_RCDF1P]","ORX_INTK_11");
		mp.put("[CLMPRDFIL_RCPRQP]","ORX_INTK_11");
		mp.put("[CLMPRDFIL_RCAFFP]","ORX_INTK_11");
		mp.put("[CLMPRDFIL_RCCNWP]","ORX_INTK_11");
		mp.put("[CLMPRDFIL_RCGRPP]","ORX_INTK_11");
		mp.put("[CLMPRDFIL_RCGCMP]","ORX_INTK_11");
		mp.put("[CLMPRDFIL_RCPL2P]","ORX_INTK_11");
		mp.put("[CLMPRDFIL_RCMCCP]","ORX_INTK_11");
		mp.put("[CLMPRDFIL_RCMBRP]","ORX_INTK_11");
		mp.put("[CLMPRDFIL_RCMAIP]","ORX_INTK_11");
		mp.put("[CLMPRDFIL_RCPUCP]","ORX_INTK_11");
		mp.put("[CLMPRDFIL_RCCARP]","ORX_INTK_12");
		mp.put("[CLMPRDFIL_RCFNLP]","ORX_INTK_12");
		mp.put("[CLMPRDFIL_RCFGLP]","ORX_INTK_12");
		mp.put("[CLMPRDFIL_RCTSCP]","ORX_INTK_12");
		mp.put("[CLMPRDFIL_RCTSDP]","ORX_INTK_12");
		mp.put("[CLMPRDFIL_RCPGOP]","ORX_INTK_12");
		mp.put("[CLMPRDFIL_RCPSPP]","ORX_INTK_12");
		mp.put("[CLMPRDFIL_RCPRFP]","ORX_INTK_12");
		mp.put("[CLMPRDFIL_RCPHYP]","ORX_INTK_12");
		mp.put("[CLMPRDFIL_RCPHDP]","ORX_INTK_12");
		mp.put("[CLMPRDFIL_RCMCFP]","ORX_INTK_12");
		mp.put("[CLMPRDFIL_RCMMDP]","ORX_INTK_13");
		mp.put("[CLMPRDFIL_RCMSIP]","ORX_INTK_13");
		mp.put("[CLMPRDFIL_RCPRDP]","ORX_INTK_13");
		mp.put("[CLMPRDFIL_RCPLQP]","ORX_INTK_13");
		mp.put("[CLMPRDFIL_RCPHNP]","ORX_INTK_13");
		mp.put("[CLMPRDFIL_RCACCP]","ORX_INTK_13");
		mp.put("[CLMPRDFIL_RCGPIP]","ORX_INTK_13");
		mp.put("[CLMPRDFIL_RCPHAP]","ORX_INTK_13");
		mp.put("[CLMPRDFIL_RCCFAP]","ORX_INTK_13");
		mp.put("[CLMPRDFIL_RCDASP]","ORX_INTK_13");
		mp.put("[CLMPRDFIL_RCPLNP]","ORX_INTK_13");
		mp.put("[CLMPRDFIL_RCPIDP]","ORX_INTK_13");
		mp.put("[DWXTRACT_RX23639F]","ORX_INTK_18");
		mp.put("[DWXTRACT2_RX23639F]","ORX_INTK_19");
		mp.put("[DWXTRACT_RCEX1P]","ORX_INTK_20");
		mp.put("[DWXTRACT2_RCEX1P]","ORX_INTK_21");
		mp.put("[CLMP02FIL_RCDPSP]","ORX_INTK_21");
		mp.put("[DWXTRACT_RX32330F3]","ORX_INTK_22");
		mp.put("[DWXTRACT2_RX32330F3]","ORX_INTK_23");
		mp.put("[DWXTRACT_RX46450F2]","ORX_INTK_24");
		mp.put("[DWXTRACT_XT_MEMBER_MONTH]","ORX_INTK_14");
		mp.put("[DWXTRACT_RX32126P1]","ORX_INTK_15");
		mp.put("[DWXTRACT_XT_MEMBER_MONTH_GROUP]","ORX_INTK_27");
		mp.put("[CUSTLIBFS_PSICNT1]","ORX_INTK_28");
		mp.put("[CUSTLIB_PSICNT1]","ORX_INTK_29");
		mp.put("[DWXTRACT2_RX32126P1]","ORX_INTK_30");




		Job_stream ORX_INTK_5 = new Job_stream();
		Job_stream ORX_INTK_6 = new Job_stream();
		Job_stream ORX_INTK_7 = new Job_stream();
		Job_stream ORX_INTK_8 = new Job_stream();
		Job_stream ORX_INTK_9 = new Job_stream();
		Job_stream ORX_INTK_10 = new Job_stream();
		Job_stream ORX_INTK_11 = new Job_stream();
		Job_stream ORX_INTK_12 = new Job_stream();
		Job_stream ORX_INTK_13 = new Job_stream();
		Job_stream ORX_INTK_18 = new Job_stream();
		Job_stream ORX_INTK_19 = new Job_stream();
		Job_stream ORX_INTK_20 = new Job_stream();
		Job_stream ORX_INTK_21 = new Job_stream();
		Job_stream ORX_INTK_22 = new Job_stream();
		Job_stream ORX_INTK_23 = new Job_stream();
		Job_stream ORX_INTK_24 = new Job_stream();
		Job_stream ORX_INTK_14 = new Job_stream();
		Job_stream ORX_INTK_15 = new Job_stream();
		Job_stream ORX_INTK_27 = new Job_stream();
		Job_stream ORX_INTK_28 = new Job_stream();
		Job_stream ORX_INTK_29 = new Job_stream();
		Job_stream ORX_INTK_30 = new Job_stream();

		ORX_INTK_5.init();
		ORX_INTK_6.init();
		ORX_INTK_7.init();
		ORX_INTK_8.init();
		ORX_INTK_9.init();
		ORX_INTK_10.init();
		ORX_INTK_11.init();
		ORX_INTK_12.init();
		ORX_INTK_13.init();
		ORX_INTK_18.init();
		ORX_INTK_19.init();
		ORX_INTK_20.init();
		ORX_INTK_21.init();
		ORX_INTK_22.init();
		ORX_INTK_23.init();
		ORX_INTK_24.init();
		ORX_INTK_14.init();
		ORX_INTK_15.init();
		ORX_INTK_27.init();
		ORX_INTK_28.init();
		ORX_INTK_29.init();
		ORX_INTK_30.init();



		while( (line = br1.readLine())!= null )
		{

			String [] tokens = line.split(";+");
			String instance_id = tokens[0].trim();
			String start_date = tokens[1].trim();
			String end_date = tokens[2].trim();
			String source_table = br2.readLine();
			if(mp.containsKey(source_table))
			{
				if (mp.get(source_table).equals("ORX_INTK_5")){ORX_INTK_5.start_date_ts.add(start_date); ORX_INTK_5.end_date_ts.add(end_date);}
				else if (mp.get(source_table).equals("ORX_INTK_6")){ORX_INTK_6.start_date_ts.add(start_date); ORX_INTK_6.end_date_ts.add(end_date);}
				else if (mp.get(source_table).equals("ORX_INTK_7")){ ORX_INTK_7.start_date_ts.add(start_date); ORX_INTK_7.end_date_ts.add(end_date);}
				else if (mp.get(source_table).equals("ORX_INTK_8")){ ORX_INTK_8.start_date_ts.add(start_date); ORX_INTK_8.end_date_ts.add(end_date);}
				else if (mp.get(source_table).equals("ORX_INTK_9")){ ORX_INTK_9.start_date_ts.add(start_date); ORX_INTK_9.end_date_ts.add(end_date);}
				else if (mp.get(source_table).equals("ORX_INTK_10")){ ORX_INTK_10.start_date_ts.add(start_date); ORX_INTK_10.end_date_ts.add(end_date);}
				else if (mp.get(source_table).equals("ORX_INTK_11")){ ORX_INTK_11.start_date_ts.add(start_date); ORX_INTK_11.end_date_ts.add(end_date);}
				else if (mp.get(source_table).equals("ORX_INTK_12")){ ORX_INTK_12.start_date_ts.add(start_date); ORX_INTK_12.end_date_ts.add(end_date);}
				else if (mp.get(source_table).equals("ORX_INTK_13")){ ORX_INTK_13.start_date_ts.add(start_date); ORX_INTK_13.end_date_ts.add(end_date);}
				else if (mp.get(source_table).equals("ORX_INTK_18")){ ORX_INTK_18.start_date_ts.add(start_date); ORX_INTK_18.end_date_ts.add(end_date);}
				else if (mp.get(source_table).equals("ORX_INTK_19")){ ORX_INTK_19.start_date_ts.add(start_date); ORX_INTK_19.end_date_ts.add(end_date);}
				else if (mp.get(source_table).equals("ORX_INTK_20")){ ORX_INTK_20.start_date_ts.add(start_date); ORX_INTK_20.end_date_ts.add(end_date);}
				else if (mp.get(source_table).equals("ORX_INTK_21")){ ORX_INTK_21.start_date_ts.add(start_date); ORX_INTK_21.end_date_ts.add(end_date);}
				else if (mp.get(source_table).equals("ORX_INTK_22")){ ORX_INTK_22.start_date_ts.add(start_date); ORX_INTK_22.end_date_ts.add(end_date);}
				else if (mp.get(source_table).equals("ORX_INTK_23")){ ORX_INTK_23.start_date_ts.add(start_date); ORX_INTK_23.end_date_ts.add(end_date);}
				else if (mp.get(source_table).equals("ORX_INTK_24")){ ORX_INTK_24.start_date_ts.add(start_date); ORX_INTK_24.end_date_ts.add(end_date);}
				else if (mp.get(source_table).equals("ORX_INTK_14")){ ORX_INTK_14.start_date_ts.add(start_date); ORX_INTK_14.end_date_ts.add(end_date);}
				else if (mp.get(source_table).equals("ORX_INTK_15")){ ORX_INTK_15.start_date_ts.add(start_date); ORX_INTK_15.end_date_ts.add(end_date);}
				else if (mp.get(source_table).equals("ORX_INTK_27")){ ORX_INTK_27.start_date_ts.add(start_date); ORX_INTK_27.end_date_ts.add(end_date);}
				else if (mp.get(source_table).equals("ORX_INTK_28")){ ORX_INTK_28.start_date_ts.add(start_date); ORX_INTK_28.end_date_ts.add(end_date);}
				else if (mp.get(source_table).equals("ORX_INTK_29")){ ORX_INTK_29.start_date_ts.add(start_date); ORX_INTK_29.end_date_ts.add(end_date);}
				else if (mp.get(source_table).equals("ORX_INTK_30")){ ORX_INTK_30.start_date_ts.add(start_date); ORX_INTK_30.end_date_ts.add(end_date);}
			}






		}

		if (!ORX_INTK_5.start_date_ts.isEmpty())System.out.println("OPW for ORX_INTK_5 "+Collections.min(ORX_INTK_5.start_date_ts)+" "+Collections.max(ORX_INTK_5.end_date_ts));
		if (!ORX_INTK_6.start_date_ts.isEmpty())System.out.println("OPW for ORX_INTK_6 "+Collections.min(ORX_INTK_6.start_date_ts)+" "+Collections.max(ORX_INTK_6.end_date_ts));
		if (!ORX_INTK_7.start_date_ts.isEmpty())System.out.println("OPW for ORX_INTK_7 "+Collections.min(ORX_INTK_7.start_date_ts)+" "+Collections.max(ORX_INTK_7.end_date_ts));
		if (!ORX_INTK_8.start_date_ts.isEmpty())System.out.println("OPW for ORX_INTK_8 "+Collections.min(ORX_INTK_8.start_date_ts)+" "+Collections.max(ORX_INTK_8.end_date_ts));
		if (!ORX_INTK_9.start_date_ts.isEmpty())System.out.println("OPW for ORX_INTK_9 "+Collections.min(ORX_INTK_9.start_date_ts)+" "+Collections.max(ORX_INTK_9.end_date_ts));
		if (!ORX_INTK_10.start_date_ts.isEmpty())System.out.println("OPW for ORX_INTK_10 "+Collections.min(ORX_INTK_10.start_date_ts)+" "+Collections.max(ORX_INTK_10.end_date_ts));
		if (!ORX_INTK_11.start_date_ts.isEmpty())System.out.println("OPW for ORX_INTK_11 "+Collections.min(ORX_INTK_11.start_date_ts)+" "+Collections.max(ORX_INTK_11.end_date_ts));
		if (!ORX_INTK_12.start_date_ts.isEmpty())System.out.println("OPW for ORX_INTK_12 "+Collections.min(ORX_INTK_12.start_date_ts)+" "+Collections.max(ORX_INTK_12.end_date_ts));
		if (!ORX_INTK_13.start_date_ts.isEmpty())System.out.println("OPW for ORX_INTK_13 "+Collections.min(ORX_INTK_13.start_date_ts)+" "+Collections.max(ORX_INTK_13.end_date_ts));
		if (!ORX_INTK_14.start_date_ts.isEmpty())System.out.println("OPW for ORX_INTK_14 "+Collections.min(ORX_INTK_14.start_date_ts)+" "+Collections.max(ORX_INTK_14.end_date_ts));
		if (!ORX_INTK_15.start_date_ts.isEmpty())System.out.println("OPW for ORX_INTK_15 "+Collections.min(ORX_INTK_15.start_date_ts)+" "+Collections.max(ORX_INTK_15.end_date_ts));
		if (!ORX_INTK_18.start_date_ts.isEmpty())System.out.println("OPW for ORX_INTK_18 "+Collections.min(ORX_INTK_18.start_date_ts)+" "+Collections.max(ORX_INTK_18.end_date_ts));
		if (!ORX_INTK_19.start_date_ts.isEmpty())System.out.println("OPW for ORX_INTK_19 "+Collections.min(ORX_INTK_19.start_date_ts)+" "+Collections.max(ORX_INTK_19.end_date_ts));
		if (!ORX_INTK_20.start_date_ts.isEmpty())System.out.println("OPW for ORX_INTK_20 "+Collections.min(ORX_INTK_20.start_date_ts)+" "+Collections.max(ORX_INTK_20.end_date_ts));
		if (!ORX_INTK_21.start_date_ts.isEmpty())System.out.println("OPW for ORX_INTK_21 "+Collections.min(ORX_INTK_21.start_date_ts)+" "+Collections.max(ORX_INTK_21.end_date_ts));
		if (!ORX_INTK_22.start_date_ts.isEmpty())System.out.println("OPW for ORX_INTK_22 "+Collections.min(ORX_INTK_22.start_date_ts)+" "+Collections.max(ORX_INTK_22.end_date_ts));
		if (!ORX_INTK_23.start_date_ts.isEmpty())System.out.println("OPW for ORX_INTK_23 "+Collections.min(ORX_INTK_23.start_date_ts)+" "+Collections.max(ORX_INTK_23.end_date_ts));
		if (!ORX_INTK_24.start_date_ts.isEmpty())System.out.println("OPW for ORX_INTK_24 "+Collections.min(ORX_INTK_24.start_date_ts)+" "+Collections.max(ORX_INTK_24.end_date_ts));
		if (!ORX_INTK_27.start_date_ts.isEmpty())System.out.println("OPW for ORX_INTK_27 "+Collections.min(ORX_INTK_27.start_date_ts)+" "+Collections.max(ORX_INTK_27.end_date_ts));
		if (!ORX_INTK_28.start_date_ts.isEmpty())System.out.println("OPW for ORX_INTK_28 "+Collections.min(ORX_INTK_28.start_date_ts)+" "+Collections.max(ORX_INTK_28.end_date_ts));
		if (!ORX_INTK_29.start_date_ts.isEmpty())System.out.println("OPW for ORX_INTK_29 "+Collections.min(ORX_INTK_29.start_date_ts)+" "+Collections.max(ORX_INTK_29.end_date_ts));
		if (!ORX_INTK_30.start_date_ts.isEmpty())System.out.println("OPW for ORX_INTK_30 "+Collections.min(ORX_INTK_30.start_date_ts)+" "+Collections.max(ORX_INTK_30.end_date_ts));


	}




}

class Job_stream
{
	ArrayList<String> start_date_ts;
	ArrayList<String> end_date_ts;

	public void init()
	{
		start_date_ts = new ArrayList<String>();
		end_date_ts= new ArrayList<String>();
	}

}

