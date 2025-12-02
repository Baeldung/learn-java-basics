package com.baeldung;

import com.baeldung.domain.record.Campaign;

public class Main {

    public static void main(String[] args) {
        Campaign campaign1 = new Campaign("First code");
        Campaign campaign2 = new Campaign("First code");

        System.out.println(campaign1.code());
        System.out.println(campaign1.equals(campaign2));
    }
}