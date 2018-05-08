package com.tverdokhlebd.mining.commons.utils;

import static java.math.RoundingMode.DOWN;

import java.math.BigDecimal;

/**
 * Utils for working with hashrate.
 *
 * @author Dmitry Tverdokhleb
 *
 */
public class HashrateUtils {

    /** 1 kH/s is 1,000 hashes per second. */
    public static final BigDecimal KH_S = BigDecimal.valueOf(1_000);
    /** 1 MH/s is 1,000,000 hashes per second. */
    public static final BigDecimal MH_S = BigDecimal.valueOf(1_000_000);
    /** 1 GH/s is 1,000,000,000 hashes per second. */
    public static final BigDecimal GH_S = BigDecimal.valueOf(1_000_000_000);
    /** 1 TH/s is 1,000,000,000,000 hashes per second. */
    public static final BigDecimal TH_S = BigDecimal.valueOf(1_000_000_000_000L);
    /** 1 PH/s is 1,000,000,000,000,000 hashes per second. */
    public static final BigDecimal PH_S = BigDecimal.valueOf(1_000_000_000_000_000L);
    /** 1 EH/s is 1,000,000,000,000,000,000 hashes per second. */
    public static final BigDecimal EH_S = BigDecimal.valueOf(1_000_000_000_000_000_000L);

    /**
     * Converts kilohashes to hashes.
     *
     * @param kiloHashes value in kilohashes
     * @return result in hashes
     */
    public static BigDecimal convertKiloHashesToHashes(BigDecimal kiloHashes) {
        return kiloHashes.multiply(KH_S).setScale(0, DOWN);
    }

    /**
     * Converts hashes to kilohashes.
     *
     * @param hashes value in hashes
     * @return result in kilohashes
     */
    public static BigDecimal convertHashesToKiloHashes(BigDecimal hashes) {
        return hashes.divide(KH_S);
    }

    /**
     * Converts megahashes to hashes.
     *
     * @param megaHashes value in megahashes
     * @return result in hashes
     */
    public static BigDecimal convertMegaHashesToHashes(BigDecimal megaHashes) {
        return megaHashes.multiply(MH_S).setScale(0, DOWN);
    }

    /**
     * Converts hashes to megahashes.
     *
     * @param hashes value in hashes
     * @return result in megahashes
     */
    public static BigDecimal convertHashesToMegaHashes(BigDecimal hashes) {
        return hashes.divide(MH_S);
    }

}
