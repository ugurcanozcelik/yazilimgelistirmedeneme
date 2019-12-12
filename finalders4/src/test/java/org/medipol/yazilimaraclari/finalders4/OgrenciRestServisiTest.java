package org.medipol.yazilimaraclari.finalders4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.medipol.yazilimaraclari.finalders4.OgrenciRestServisi.Ogrenci;

class OgrenciRestServisiTest {

	@Test
	void testAll() {
		fail("Not yet implemented");
	}

	@Test
	void testNewEmployee() {
		OgrenciRestServisi servis1 = new OgrenciRestServisi();
		String adSoyad = "adSoyad1";
		Ogrenci sonuc = servis1.newEmployee(adSoyad);
		assertNotNull(sonuc);
		assertEquals(adSoyad, sonuc.getAdSoyad());
	}

	@Test
	void testNewEmployee2() {
		fail("Not yet implemented");
	}

}
