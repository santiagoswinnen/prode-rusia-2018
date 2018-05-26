import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellReference;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class ExcelReader {

	public static Prode readProde(String path) throws IOException, InvalidFormatException {

		Prode prode = new Prode();

		// Creating a Workbook from an Excel file (.xls or .xlsx)
		Workbook workbook = WorkbookFactory.create(new File(path));

		Cell rusia = workbook.getSheetAt(1).getRow(9).getCell(7);
		Cell arabia = workbook.getSheetAt(1).getRow(9).getCell(9);
		Match rusiaArabia = new Match("Rusia",((Double)rusia.getNumericCellValue()).intValue(),"Arabia Saudi", ((Double)arabia.getNumericCellValue()).intValue(),1,0);
		prode.addMatch(rusiaArabia);


		Cell egipto = workbook.getSheetAt(1).getRow(13).getCell(7);
		Cell uruguay = workbook.getSheetAt(1).getRow(13).getCell(9);
		Match egiptoUruguay = new Match("Egipto",((Double)egipto.getNumericCellValue()).intValue(),"Uruguay", ((Double)uruguay.getNumericCellValue()).intValue(),2,0);
		prode.addMatch(egiptoUruguay);

		Cell rusia2 = workbook.getSheetAt(1).getRow(17).getCell(7);
		Cell egipto2 = workbook.getSheetAt(1).getRow(17).getCell(9);
		Match rusiaEgipto = new Match("Rusia",((Double)rusia2.getNumericCellValue()).intValue(),"Egipto", ((Double)egipto2.getNumericCellValue()).intValue(),3,0);
		prode.addMatch(rusiaEgipto);

		Cell uruguay2 = workbook.getSheetAt(1).getRow(21).getCell(7);
		Cell arabia2 = workbook.getSheetAt(1).getRow(21).getCell(9);
		Match uruguayArabia = new Match("Uruguay",((Double)uruguay2.getNumericCellValue()).intValue(),"Arabia Saudi", ((Double)arabia2.getNumericCellValue()).intValue(),4,0);
		prode.addMatch(uruguayArabia);

		Cell arabia3 = workbook.getSheetAt(1).getRow(25).getCell(7);
		Cell egipto3 = workbook.getSheetAt(1).getRow(25).getCell(9);
		Match arabiaEgipto = new Match("Arabia Saudi",((Double)arabia3.getNumericCellValue()).intValue(),"Egipto", ((Double)egipto3.getNumericCellValue()).intValue(),5,0);
		prode.addMatch(arabiaEgipto);

		Cell uruguay3 = workbook.getSheetAt(1).getRow(29).getCell(7);
		Cell rusia3 = workbook.getSheetAt(1).getRow(29).getCell(9);
		Match uruguayRusia = new Match("Uruguay",((Double)uruguay3.getNumericCellValue()).intValue(),"Rusia", ((Double)rusia3.getNumericCellValue()).intValue(),6,0);
		prode.addMatch(uruguayRusia);

		//GRUPO B

		Cell marruecos = workbook.getSheetAt(2).getRow(9).getCell(7);
		Cell iran = workbook.getSheetAt(2).getRow(9).getCell(9);
		Match marruecosIran = new Match("Marruecos",((Double)marruecos.getNumericCellValue()).intValue(),"Irán", ((Double)iran.getNumericCellValue()).intValue(),7,0);
		prode.addMatch(marruecosIran);


		Cell portugal = workbook.getSheetAt(2).getRow(13).getCell(7);
		Cell espana = workbook.getSheetAt(2).getRow(13).getCell(9);
		Match portugalEspana= new Match("Portugal",((Double)portugal.getNumericCellValue()).intValue(),"España", ((Double)espana.getNumericCellValue()).intValue(),8,0);
		prode.addMatch(portugalEspana);

		Cell iran2 = workbook.getSheetAt(2).getRow(17).getCell(7);
		Cell espana2 = workbook.getSheetAt(2).getRow(17).getCell(9);
		Match iranEspana = new Match("Irán",((Double)iran2.getNumericCellValue()).intValue(),"España", ((Double)espana2.getNumericCellValue()).intValue(),9,0);
		prode.addMatch(iranEspana);

		Cell portugal2 = workbook.getSheetAt(2).getRow(21).getCell(7);
		Cell marruecos2 = workbook.getSheetAt(2).getRow(21).getCell(9);
		Match portugalMarruecos = new Match("Portugal",((Double)portugal2.getNumericCellValue()).intValue(),"Marruecos", ((Double)marruecos2.getNumericCellValue()).intValue(),10,0);
		prode.addMatch(portugalMarruecos);

		Cell iran3 = workbook.getSheetAt(2).getRow(25).getCell(7);
		Cell portugal3 = workbook.getSheetAt(2).getRow(25).getCell(9);
		Match iranPortugal = new Match("Irán",((Double)iran3.getNumericCellValue()).intValue(),"Portugal", ((Double)portugal3.getNumericCellValue()).intValue(),11,0);
		prode.addMatch(iranPortugal);

		Cell espana3 = workbook.getSheetAt(2).getRow(29).getCell(7);
		Cell marruecos3 = workbook.getSheetAt(2).getRow(29).getCell(9);
		Match espanaMarruecos = new Match("España",((Double)espana3.getNumericCellValue()).intValue(),"Marruecos", ((Double)marruecos3.getNumericCellValue()).intValue(),12,0);
		prode.addMatch(espanaMarruecos);


		//GRUPO C


		Cell francia = workbook.getSheetAt(3).getRow(9).getCell(7);
		Cell australia = workbook.getSheetAt(3).getRow(9).getCell(9);
		Match franciaAustralia= new Match("Francia",((Double)francia.getNumericCellValue()).intValue(),"Australia", ((Double)australia.getNumericCellValue()).intValue(),13,0);
		prode.addMatch(franciaAustralia);

		Cell peru = workbook.getSheetAt(3).getRow(13).getCell(7);
		Cell dinamarca = workbook.getSheetAt(3).getRow(13).getCell(9);
		Match peruDinamarca = new Match("Perú",((Double)peru.getNumericCellValue()).intValue(),"Dinamarca", ((Double)dinamarca.getNumericCellValue()).intValue(),14,0);
		prode.addMatch(peruDinamarca);

		Cell dinamarca2 = workbook.getSheetAt(3).getRow(17).getCell(7);
		Cell australia2 = workbook.getSheetAt(3).getRow(17).getCell(9);
		Match dinamarcaAustralia = new Match("Dinamarca",((Double)dinamarca2.getNumericCellValue()).intValue(),"Australia", ((Double)australia2.getNumericCellValue()).intValue(),15,0);
		prode.addMatch(dinamarcaAustralia);

		Cell francia2 = workbook.getSheetAt(3).getRow(21).getCell(7);
		Cell peru2 = workbook.getSheetAt(3).getRow(21).getCell(9);
		Match franciaPeru = new Match("Francia",((Double)francia2.getNumericCellValue()).intValue(),"Perú", ((Double)peru2.getNumericCellValue()).intValue(),16,0);
		prode.addMatch(franciaPeru);

		Cell australia3 = workbook.getSheetAt(3).getRow(25).getCell(7);
		Cell peru3 = workbook.getSheetAt(3).getRow(25).getCell(9);
		Match australiaPeru = new Match("Australia",((Double)australia3.getNumericCellValue()).intValue(),"Perú", ((Double)peru3.getNumericCellValue()).intValue(),17,0);
		prode.addMatch(australiaPeru);

		Cell dinamarca3 = workbook.getSheetAt(3).getRow(29).getCell(7);
		Cell francia3 = workbook.getSheetAt(3).getRow(29).getCell(9);
		Match dinamarcaFrancia = new Match("Dinamarca",((Double)dinamarca3.getNumericCellValue()).intValue(),"Francia", ((Double)francia3.getNumericCellValue()).intValue(),18,0);
		prode.addMatch(dinamarcaFrancia);

		//GRUPO D

		Cell argentina = workbook.getSheetAt(4).getRow(9).getCell(7);
		Cell islandia = workbook.getSheetAt(4).getRow(9).getCell(9);
		Match argentinaIslandia= new Match("Argentina",((Double)argentina.getNumericCellValue()).intValue(),"Islandia", ((Double)islandia.getNumericCellValue()).intValue(),19,0);
		prode.addMatch(argentinaIslandia);

		Cell croacia = workbook.getSheetAt(4).getRow(13).getCell(7);
		Cell nigeria = workbook.getSheetAt(4).getRow(13).getCell(9);
		Match croaciaNigeria = new Match("Croacia",((Double)croacia.getNumericCellValue()).intValue(),"Nigeria", ((Double)nigeria.getNumericCellValue()).intValue(),20,0);
		prode.addMatch(croaciaNigeria);

		Cell argentina2 = workbook.getSheetAt(4).getRow(17).getCell(7);
		Cell croacia2 = workbook.getSheetAt(4).getRow(17).getCell(9);
		Match argentinaCroacia = new Match("Argentina",((Double)argentina2.getNumericCellValue()).intValue(),"Croacia", ((Double)croacia2.getNumericCellValue()).intValue(),21,0);
		prode.addMatch(argentinaCroacia);

		Cell nigeria2 = workbook.getSheetAt(4).getRow(21).getCell(7);
		Cell islandia2 = workbook.getSheetAt(4).getRow(21).getCell(9);
		Match nigeriaIslandia = new Match("Nigeria",((Double)nigeria2.getNumericCellValue()).intValue(),"Islandia", ((Double)islandia2.getNumericCellValue()).intValue(),22,0);
		prode.addMatch(nigeriaIslandia);

		Cell islandia3 = workbook.getSheetAt(4).getRow(25).getCell(7);
		Cell croacia3 = workbook.getSheetAt(3).getRow(25).getCell(9);
		Match islandiaCroacia = new Match("Islandia",((Double)islandia3.getNumericCellValue()).intValue(),"Croacia", ((Double)croacia3.getNumericCellValue()).intValue(),23,0);
		prode.addMatch(islandiaCroacia);

		Cell nigeria3 = workbook.getSheetAt(4).getRow(29).getCell(7);
		Cell argentina3 = workbook.getSheetAt(4).getRow(29).getCell(9);
		Match nigeriaArgentina = new Match("Nigeria",((Double)nigeria3.getNumericCellValue()).intValue(),"Argentina", ((Double)argentina3.getNumericCellValue()).intValue(),24,0);
		prode.addMatch(nigeriaArgentina);

		//GRUPO E

		Cell brasil = workbook.getSheetAt(5).getRow(9).getCell(7);
		Cell suiza = workbook.getSheetAt(5).getRow(9).getCell(9);
		Match brasilSuiza= new Match("Brasil",((Double)brasil.getNumericCellValue()).intValue(),"Suiza", ((Double)suiza.getNumericCellValue()).intValue(),25,0);
		prode.addMatch(brasilSuiza);

		Cell costaRica = workbook.getSheetAt(5).getRow(13).getCell(7);
		Cell serbia = workbook.getSheetAt(5).getRow(13).getCell(9);
		Match costaRicaSerbia = new Match("Costa Rica",((Double)costaRica.getNumericCellValue()).intValue(),"Serbia", ((Double)serbia.getNumericCellValue()).intValue(),26,0);
		prode.addMatch(costaRicaSerbia);

		Cell brasil2 = workbook.getSheetAt(5).getRow(17).getCell(7);
		Cell costaRica2 = workbook.getSheetAt(5).getRow(17).getCell(9);
		Match brasilCostaRica = new Match("Brasil",((Double)brasil2.getNumericCellValue()).intValue(),"Costa Rica", ((Double)costaRica2.getNumericCellValue()).intValue(),27,0);
		prode.addMatch(brasilCostaRica);

		Cell serbia2 = workbook.getSheetAt(5).getRow(21).getCell(7);
		Cell suiza2 = workbook.getSheetAt(5).getRow(21).getCell(9);
		Match serbiaSuiza = new Match("Serbia",((Double)serbia2.getNumericCellValue()).intValue(),"Suiza", ((Double)suiza2.getNumericCellValue()).intValue(),28,0);
		prode.addMatch(serbiaSuiza);

		Cell serbia3 = workbook.getSheetAt(5).getRow(25).getCell(7);
		Cell brasil3 = workbook.getSheetAt(5).getRow(25).getCell(9);
		Match serbiaBrasil = new Match("Serbia",((Double)serbia3.getNumericCellValue()).intValue(),"Brasil", ((Double)brasil3.getNumericCellValue()).intValue(),29,0);
		prode.addMatch(serbiaBrasil);

		Cell suiza3 = workbook.getSheetAt(5).getRow(29).getCell(7);
		Cell costaRica3 = workbook.getSheetAt(5).getRow(29).getCell(9);
		Match suizaCostaRica = new Match("Suiza",((Double)suiza3.getNumericCellValue()).intValue(),"Costa Rica", ((Double)costaRica3.getNumericCellValue()).intValue(),30,0);
		prode.addMatch(suizaCostaRica);

		//GRUPO F

		Cell alemania = workbook.getSheetAt(6).getRow(9).getCell(7);
		Cell mexico = workbook.getSheetAt(6).getRow(9).getCell(9);
		Match alemaniaMexico= new Match("Alemania",((Double)alemania.getNumericCellValue()).intValue(),"México", ((Double)mexico.getNumericCellValue()).intValue(),31,0);
		prode.addMatch(alemaniaMexico);

		Cell suecia = workbook.getSheetAt(6).getRow(13).getCell(7);
		Cell corea = workbook.getSheetAt(6).getRow(13).getCell(9);
		Match sueciaCorea = new Match("Suecia",((Double)suecia.getNumericCellValue()).intValue(),"Corea", ((Double)corea.getNumericCellValue()).intValue(),32,0);
		prode.addMatch(sueciaCorea);

		Cell alemania2 = workbook.getSheetAt(6).getRow(17).getCell(7);
		Cell suecia2 = workbook.getSheetAt(6).getRow(17).getCell(9);
		Match alemaniaSuecia = new Match("Alemania",((Double)alemania2.getNumericCellValue()).intValue(),"Suecia", ((Double)suecia2.getNumericCellValue()).intValue(),33,0);
		prode.addMatch(alemaniaSuecia);

		Cell corea2 = workbook.getSheetAt(6).getRow(21).getCell(7);
		Cell mexico2 = workbook.getSheetAt(6).getRow(21).getCell(9);
		Match coreaMexico = new Match("Corea",((Double)corea2.getNumericCellValue()).intValue(),"México", ((Double)mexico2.getNumericCellValue()).intValue(),34,0);
		prode.addMatch(coreaMexico);

		Cell corea3 = workbook.getSheetAt(6).getRow(25).getCell(7);
		Cell alemania3 = workbook.getSheetAt(6).getRow(25).getCell(9);
		Match coreaAlemania = new Match("Corea",((Double)corea3.getNumericCellValue()).intValue(),"Alemania", ((Double)alemania3.getNumericCellValue()).intValue(),35,0);
		prode.addMatch(coreaAlemania);

		Cell mexico3 = workbook.getSheetAt(6).getRow(29).getCell(7);
		Cell suecia3 = workbook.getSheetAt(6).getRow(29).getCell(9);
		Match mexicoSuecia = new Match("México",((Double)mexico3.getNumericCellValue()).intValue(),"Suecia", ((Double)suecia3.getNumericCellValue()).intValue(),36,0);
		prode.addMatch(mexicoSuecia);

		//GRUPO G

		Cell belgica = workbook.getSheetAt(7).getRow(9).getCell(7);
		Cell panama = workbook.getSheetAt(7).getRow(9).getCell(9);
		Match belgicaPanama= new Match("Bélgica",((Double)belgica.getNumericCellValue()).intValue(),"Panamá", ((Double)panama.getNumericCellValue()).intValue(),37,0);
		prode.addMatch(belgicaPanama);

		Cell tunez = workbook.getSheetAt(7).getRow(13).getCell(7);
		Cell inglaterra = workbook.getSheetAt(7).getRow(13).getCell(9);
		Match tunezInglaterra = new Match("Túnez",((Double)tunez.getNumericCellValue()).intValue(),"Inglaterra", ((Double)inglaterra.getNumericCellValue()).intValue(),38,0);
		prode.addMatch(tunezInglaterra);

		Cell belgica2 = workbook.getSheetAt(7).getRow(17).getCell(7);
		Cell tunez2 = workbook.getSheetAt(7).getRow(17).getCell(9);
		Match belgicaTunez = new Match("Bélgica",((Double)belgica2.getNumericCellValue()).intValue(),"Túnez", ((Double)tunez2.getNumericCellValue()).intValue(),39,0);
		prode.addMatch(belgicaTunez);

		Cell inglaterra2 = workbook.getSheetAt(7).getRow(21).getCell(7);
		Cell panama2 = workbook.getSheetAt(7).getRow(21).getCell(9);
		Match inglaterraPanama = new Match("Inglaterra",((Double)inglaterra2.getNumericCellValue()).intValue(),"Panamá", ((Double)panama2.getNumericCellValue()).intValue(),40,0);
		prode.addMatch(inglaterraPanama);

		Cell inglaterra3 = workbook.getSheetAt(7).getRow(25).getCell(7);
		Cell belgica3 = workbook.getSheetAt(7).getRow(25).getCell(9);
		Match inglaterraBelgica = new Match("Inglaterra",((Double)inglaterra3.getNumericCellValue()).intValue(),"Bélgica", ((Double)belgica3.getNumericCellValue()).intValue(),41,0);
		prode.addMatch(inglaterraBelgica);

		Cell panama3 = workbook.getSheetAt(7).getRow(29).getCell(7);
		Cell tunez3 = workbook.getSheetAt(7).getRow(29).getCell(9);
		Match panamaTunez = new Match("Panamá",((Double)panama3.getNumericCellValue()).intValue(),"Túnez", ((Double)tunez3.getNumericCellValue()).intValue(),42,0);
		prode.addMatch(panamaTunez);

		//GRUPO H

		Cell colombia = workbook.getSheetAt(8).getRow(9).getCell(7);
		Cell japon = workbook.getSheetAt(8).getRow(9).getCell(9);
		Match colombiaJapon= new Match("Colombia",((Double)colombia.getNumericCellValue()).intValue(),"Japón", ((Double)japon.getNumericCellValue()).intValue(),43,0);
		prode.addMatch(colombiaJapon);

		Cell polonia = workbook.getSheetAt(8).getRow(13).getCell(7);
		Cell senegal = workbook.getSheetAt(8).getRow(13).getCell(9);
		Match poloniaSenegal = new Match("Polonia",((Double)polonia.getNumericCellValue()).intValue(),"Senegal", ((Double)senegal.getNumericCellValue()).intValue(),44,0);
		prode.addMatch(poloniaSenegal);

		Cell japon2 = workbook.getSheetAt(8).getRow(17).getCell(7);
		Cell senegal2 = workbook.getSheetAt(8).getRow(17).getCell(9);
		Match japonSenegal = new Match("Japón",((Double)japon2.getNumericCellValue()).intValue(),"Senegal", ((Double)senegal2.getNumericCellValue()).intValue(),45,0);
		prode.addMatch(japonSenegal);

		Cell polonia2 = workbook.getSheetAt(8).getRow(21).getCell(7);
		Cell colombia2 = workbook.getSheetAt(8).getRow(21).getCell(9);
		Match poloniaColombia = new Match("Polonia",((Double)polonia2.getNumericCellValue()).intValue(),"Colombia", ((Double)colombia2.getNumericCellValue()).intValue(),46,0);
		prode.addMatch(poloniaColombia);

		Cell japon3 = workbook.getSheetAt(8).getRow(25).getCell(7);
		Cell polonia3 = workbook.getSheetAt(8).getRow(25).getCell(9);
		Match japonPolonia = new Match("Japón",((Double)japon3.getNumericCellValue()).intValue(),"Polonia", ((Double)polonia3.getNumericCellValue()).intValue(),47,0);
		prode.addMatch(japonPolonia);

		Cell senegal3 = workbook.getSheetAt(8).getRow(29).getCell(7);
		Cell colombia3 = workbook.getSheetAt(8).getRow(29).getCell(9);
		Match senegalColombia = new Match("Senegal",((Double)senegal3.getNumericCellValue()).intValue(),"Colombia", ((Double)colombia3.getNumericCellValue()).intValue(),48,0);
		prode.addMatch(senegalColombia);


		//OCTAVOS

		System.out.println("");

		Cell a1Name = workbook.getSheetAt(9).getRow(6).getCell(4);
		Cell a1 = workbook.getSheetAt(9).getRow(6).getCell(7);
		Cell a2Name = workbook.getSheetAt(9).getRow(6).getCell(12);
		Cell a2 = workbook.getSheetAt(9).getRow(6).getCell(9);
		Match a= new Match(a1Name.getStringCellValue(),((Double)a1.getNumericCellValue()).intValue(),
				a2Name.getStringCellValue(), ((Double)a2.getNumericCellValue()).intValue(),49,16);
		prode.addMatch(a);

		Cell b1Name = workbook.getSheetAt(9).getRow(10).getCell(4);
		Cell b1 = workbook.getSheetAt(9).getRow(10).getCell(7);
		Cell b2Name = workbook.getSheetAt(9).getRow(10).getCell(12);
		Cell b2 = workbook.getSheetAt(9).getRow(10).getCell(9);
		Match b= new Match(b1Name.getStringCellValue(),((Double)b1.getNumericCellValue()).intValue(),
				b2Name.getStringCellValue(), ((Double)b2.getNumericCellValue()).intValue(),50,16);
		prode.addMatch(b);

		Cell c1Name = workbook.getSheetAt(9).getRow(14).getCell(4);
		Cell c1 = workbook.getSheetAt(9).getRow(14).getCell(7);
		Cell c2Name = workbook.getSheetAt(9).getRow(14).getCell(12);
		Cell c2 = workbook.getSheetAt(9).getRow(14).getCell(9);
		Match c= new Match(c1Name.getStringCellValue(),((Double)c1.getNumericCellValue()).intValue(),
				c2Name.getStringCellValue(), ((Double)c2.getNumericCellValue()).intValue(),51,16);
		prode.addMatch(c);

		Cell d1Name = workbook.getSheetAt(9).getRow(18).getCell(4);
		Cell d1 = workbook.getSheetAt(9).getRow(18).getCell(7);
		Cell d2Name = workbook.getSheetAt(9).getRow(18).getCell(12);
		Cell d2 = workbook.getSheetAt(9).getRow(18).getCell(9);
		Match d= new Match(d1Name.getStringCellValue(),((Double)d1.getNumericCellValue()).intValue(),
				d2Name.getStringCellValue(), ((Double)d2.getNumericCellValue()).intValue(),52,16);
		prode.addMatch(d);

		Cell e1Name = workbook.getSheetAt(9).getRow(22).getCell(4);
		Cell e1 = workbook.getSheetAt(9).getRow(22).getCell(7);
		Cell e2Name = workbook.getSheetAt(9).getRow(22).getCell(12);
		Cell e2 = workbook.getSheetAt(9).getRow(22).getCell(9);
		Match e= new Match(e1Name.getStringCellValue(),((Double)e1.getNumericCellValue()).intValue(),
				e2Name.getStringCellValue(), ((Double)e2.getNumericCellValue()).intValue(),53,16);
		prode.addMatch(e);

		Cell f1Name = workbook.getSheetAt(9).getRow(26).getCell(4);
		Cell f1 = workbook.getSheetAt(9).getRow(26).getCell(7);
		Cell f2Name = workbook.getSheetAt(9).getRow(26).getCell(12);
		Cell f2 = workbook.getSheetAt(9).getRow(26).getCell(9);
		Match f= new Match(f1Name.getStringCellValue(),((Double)f1.getNumericCellValue()).intValue(),
				f2Name.getStringCellValue(), ((Double)f2.getNumericCellValue()).intValue(),54,16);
		prode.addMatch(f);

		Cell g1Name = workbook.getSheetAt(9).getRow(30).getCell(4);
		Cell g1 = workbook.getSheetAt(9).getRow(30).getCell(7);
		Cell g2Name = workbook.getSheetAt(9).getRow(30).getCell(12);
		Cell g2 = workbook.getSheetAt(9).getRow(30).getCell(9);
		Match g= new Match(g1Name.getStringCellValue(),((Double)g1.getNumericCellValue()).intValue(),
				g2Name.getStringCellValue(), ((Double)g2.getNumericCellValue()).intValue(),55,16);
		prode.addMatch(g);

		Cell h1Name = workbook.getSheetAt(9).getRow(34).getCell(4);
		Cell h1 = workbook.getSheetAt(9).getRow(34).getCell(7);
		Cell h2Name = workbook.getSheetAt(9).getRow(34).getCell(12);
		Cell h2 = workbook.getSheetAt(9).getRow(34).getCell(9);
		Match h= new Match(h1Name.getStringCellValue(),((Double)h1.getNumericCellValue()).intValue(),
				h2Name.getStringCellValue(), ((Double)h2.getNumericCellValue()).intValue(),56,16);
		prode.addMatch(h);

		//CUARTOS

		System.out.println("");

		Cell ca1Name = workbook.getSheetAt(10).getRow(6).getCell(4);
		Cell ca1 = workbook.getSheetAt(10).getRow(6).getCell(7);
		Cell ca2Name = workbook.getSheetAt(10).getRow(6).getCell(12);
		Cell ca2 = workbook.getSheetAt(10).getRow(6).getCell(9);
		Match ca= new Match(ca1Name.getStringCellValue(),((Double)ca1.getNumericCellValue()).intValue(),
				ca2Name.getStringCellValue(), ((Double)ca2.getNumericCellValue()).intValue(),57,8);
		prode.addMatch(ca);

		Cell cb1Name = workbook.getSheetAt(10).getRow(10).getCell(4);
		Cell cb1 = workbook.getSheetAt(10).getRow(10).getCell(7);
		Cell cb2Name = workbook.getSheetAt(10).getRow(10).getCell(12);
		Cell cb2 = workbook.getSheetAt(10).getRow(10).getCell(9);
		Match cb= new Match(cb1Name.getStringCellValue(),((Double)cb1.getNumericCellValue()).intValue(),
				cb2Name.getStringCellValue(), ((Double)cb2.getNumericCellValue()).intValue(),58,8);
		prode.addMatch(cb);

		Cell cc1Name = workbook.getSheetAt(10).getRow(14).getCell(4);
		Cell cc1 = workbook.getSheetAt(10).getRow(14).getCell(7);
		Cell cc2Name = workbook.getSheetAt(10).getRow(14).getCell(12);
		Cell cc2 = workbook.getSheetAt(10).getRow(14).getCell(9);
		Match cc= new Match(cc1Name.getStringCellValue(),((Double)cc1.getNumericCellValue()).intValue(),
				cc2Name.getStringCellValue(), ((Double)cc2.getNumericCellValue()).intValue(),59,8);
		prode.addMatch(cc);

		Cell cd1Name = workbook.getSheetAt(10).getRow(18).getCell(4);
		Cell cd1 = workbook.getSheetAt(10).getRow(18).getCell(7);
		Cell cd2Name = workbook.getSheetAt(10).getRow(18).getCell(12);
		Cell cd2 = workbook.getSheetAt(10).getRow(18).getCell(9);
		Match cd= new Match(cd1Name.getStringCellValue(),((Double)cd1.getNumericCellValue()).intValue(),
				cd2Name.getStringCellValue(), ((Double)cd2.getNumericCellValue()).intValue(),60,8);
		prode.addMatch(cd);

		//SEMI

		System.out.println("");

		Cell sa1Name = workbook.getSheetAt(11).getRow(6).getCell(4);
		Cell sa1 = workbook.getSheetAt(11).getRow(6).getCell(7);
		Cell sa2Name = workbook.getSheetAt(11).getRow(6).getCell(12);
		Cell sa2 = workbook.getSheetAt(11).getRow(6).getCell(9);
		Match sa= new Match(sa1Name.getStringCellValue(),((Double)sa1.getNumericCellValue()).intValue(),
				sa2Name.getStringCellValue(), ((Double)sa2.getNumericCellValue()).intValue(),61,4);
		prode.addMatch(sa);

		Cell sb1Name = workbook.getSheetAt(11).getRow(10).getCell(4);
		Cell sb1 = workbook.getSheetAt(11).getRow(10).getCell(7);
		Cell sb2Name = workbook.getSheetAt(11).getRow(10).getCell(12);
		Cell sb2 = workbook.getSheetAt(11).getRow(10).getCell(9);
		Match sb= new Match(sb1Name.getStringCellValue(),((Double)sb1.getNumericCellValue()).intValue(),
				sb2Name.getStringCellValue(), ((Double)sb2.getNumericCellValue()).intValue(),62,4);
		prode.addMatch(sb);

		Cell tp1Name = workbook.getSheetAt(11).getRow(17).getCell(4);
		Cell tp1 = workbook.getSheetAt(11).getRow(17).getCell(7);
		Cell tp2Name = workbook.getSheetAt(11).getRow(17).getCell(12);
		Cell tp2 = workbook.getSheetAt(11).getRow(17).getCell(9);
		Match tp= new Match(tp1Name.getStringCellValue(),((Double)tp1.getNumericCellValue()).intValue(),
				tp2Name.getStringCellValue(), ((Double)tp2.getNumericCellValue()).intValue(),63,2);
		prode.addMatch(tp);

		Cell final1Name = workbook.getSheetAt(11).getRow(24).getCell(4);
		Cell final1 = workbook.getSheetAt(11).getRow(24).getCell(7);
		Cell final2Name = workbook.getSheetAt(11).getRow(24).getCell(12);
		Cell final2 = workbook.getSheetAt(11).getRow(24).getCell(9);
		Match finale = new Match(final1Name.getStringCellValue(),((Double)final1.getNumericCellValue()).intValue(),
				final2Name.getStringCellValue(), ((Double)final2.getNumericCellValue()).intValue(),64,2);
		prode.addMatch(finale);


		Cell champ = workbook.getSheetAt(11).getRow(32).getCell(3);
		String champion = champ.getStringCellValue();
		prode.setChampion(champion);

		Cell thirdPos = workbook.getSheetAt(11).getRow(17).getCell(18);
		String third = thirdPos.getStringCellValue();
		prode.setThird(third);


		workbook.close();

		return prode;
	}
}
