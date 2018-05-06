package com.tverdokhlebd.mining.utils;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

/**
 * Tests of hashrate utils.
 *
 * @author Dmitry Tverdokhleb
 *
 */
public class HashrateUtilsTest {

    @Test
    public void testConvertingKiloHashesToHashes() {
        BigDecimal kiloHashes1 = BigDecimal.valueOf(174.05);
        assertEquals(BigDecimal.valueOf(174050), HashrateUtils.convertKiloHashesToHashes(kiloHashes1));
        BigDecimal kiloHashes2 = BigDecimal.valueOf(174);
        assertEquals(BigDecimal.valueOf(174000), HashrateUtils.convertKiloHashesToHashes(kiloHashes2));
        BigDecimal kiloHashes3 = BigDecimal.valueOf(1740.5);
        assertEquals(BigDecimal.valueOf(1740500), HashrateUtils.convertKiloHashesToHashes(kiloHashes3));
    }

    @Test
    public void testConvertingHashesToKiloHashes() {
        BigDecimal hashes1 = BigDecimal.valueOf(174050);
        assertEquals(BigDecimal.valueOf(174.05), HashrateUtils.convertHashesToKiloHashes(hashes1));
        BigDecimal hashes2 = BigDecimal.valueOf(174000);
        assertEquals(BigDecimal.valueOf(174), HashrateUtils.convertHashesToKiloHashes(hashes2));
        BigDecimal hashes3 = BigDecimal.valueOf(1740517);
        assertEquals(BigDecimal.valueOf(1740.517), HashrateUtils.convertHashesToKiloHashes(hashes3));
    }

    @Test
    public void testConvertingMegaHashesToHashes() {
        BigDecimal megaHashes1 = BigDecimal.valueOf(174.05);
        assertEquals(BigDecimal.valueOf(174050000), HashrateUtils.convertMegaHashesToHashes(megaHashes1));
        BigDecimal megaHashes2 = BigDecimal.valueOf(174);
        assertEquals(BigDecimal.valueOf(174000000), HashrateUtils.convertMegaHashesToHashes(megaHashes2));
        BigDecimal megaHashes3 = BigDecimal.valueOf(1740.5);
        assertEquals(BigDecimal.valueOf(1740500000), HashrateUtils.convertMegaHashesToHashes(megaHashes3));
    }

    @Test
    public void testConvertingHashesToMegaHashes() {
        BigDecimal hashes1 = BigDecimal.valueOf(174050000);
        assertEquals(BigDecimal.valueOf(174.05), HashrateUtils.convertHashesToMegaHashes(hashes1));
        BigDecimal hashes2 = BigDecimal.valueOf(174000000);
        assertEquals(BigDecimal.valueOf(174), HashrateUtils.convertHashesToMegaHashes(hashes2));
        BigDecimal hashes3 = BigDecimal.valueOf(1740517405);
        assertEquals(BigDecimal.valueOf(1740.517405), HashrateUtils.convertHashesToMegaHashes(hashes3));
    }

}
