package org.medipol.yazilimaraclari.finalders4;
import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class OgrenciRestServisi {

	private static long counter = 2019000001;
	private static List<Ogrenci> ogrenciListesi = new ArrayList<>();

	@GetMapping("/ogrenci/listele")
	List<Ogrenci> all() {
		return ogrenciListesi;
	}

	/*--
	 curl -d "adSoyad=Ali Veli" -X POST http://localhost:8080/ogrenci/ekle
	 */
	@PostMapping("/ogrenci/ekle")
	Ogrenci newEmployee(@RequestParam String adSoyad) {
		String ogrenciNo = String.valueOf( counter++ );
		Ogrenci yeniOgrenci = new Ogrenci(adSoyad, ogrenciNo);
		ogrenciListesi.add(yeniOgrenci);
		return yeniOgrenci;
	}
	
	/*--
	 curl -d '{"adSoyad":"Ozkan", "ogrenciNo":"2018000001"}' -H "Content-Type: application/json" -X POST http://localhost:8080/ogrenci/ekle2
	 */
	@PostMapping("/ogrenci/ekle2")
	Ogrenci newEmployee2(@RequestBody Ogrenci yeniOgrenci) {
		ogrenciListesi.add(yeniOgrenci);
		return yeniOgrenci;
	}

	public static class Ogrenci {
		private String adSoyad;
		private String ogrenciNo;
		public Ogrenci() {
			
		}
		public Ogrenci(String adSoyad, String ogrenciNo) {
			this.adSoyad = adSoyad;
			this.ogrenciNo = ogrenciNo;
		}
		public String getAdSoyad() {
			return adSoyad;
		}
		public String getOgrenciNo() {
			return ogrenciNo;
		}
		public void setAdSoyad(String adSoyad) {
			this.adSoyad = adSoyad;
		}
		public void setOgrenciNo(String ogrenciNo) {
			this.ogrenciNo = ogrenciNo;
		}
		
	}
}