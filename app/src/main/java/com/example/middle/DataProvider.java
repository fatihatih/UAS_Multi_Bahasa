package com.example.middle;

import android.content.Context;

import com.example.middle.model.Burung;
import com.example.middle.model.Hewan;
import com.example.middle.model.Ikan;
import com.example.middle.model.Serangga;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Burung> DataBurung(Context ctx) {
        List<Burung> burungs = new ArrayList<>();
        burungs.add(new Burung(ctx.getString(R.string.kenari_nama), ctx.getString(R.string.kenari_asal),
                ctx.getString(R.string.kenari_deskripsi), R.drawable.kenari));
        burungs.add(new Burung(ctx.getString(R.string.murai_nama), ctx.getString(R.string.murai_asal),
                ctx.getString(R.string.murai_deskripsi), R.drawable.murai));
        burungs.add(new Burung(ctx.getString(R.string.love_nama), ctx.getString(R.string.love_asal),
                ctx.getString(R.string.love_deskripsi), R.drawable.lovebird));
        burungs.add(new Burung(ctx.getString(R.string.cucak_nama), ctx.getString(R.string.cucak_asal),
                ctx.getString(R.string.cucak_deskripsi), R.drawable.cucak_rowo));
        burungs.add(new Burung(ctx.getString(R.string.jalak_nama), ctx.getString(R.string.jalak_asal),
                ctx.getString(R.string.jalak_deskripsi), R.drawable.jalak_bali));
        return burungs;
    }

    private static List<Ikan> DataIkan(Context ctx) {
        List<Ikan> ikans = new ArrayList<>();
        ikans.add(new Ikan(ctx.getString(R.string.cupak_nama), ctx.getString(R.string.cupang_asal),
                ctx.getString(R.string.cupang_deskripsi), R.drawable.ikan_cupang));
        ikans.add(new Ikan(ctx.getString(R.string.hiu_nama), ctx.getString(R.string.hiu_asal),
                ctx.getString(R.string.hiu_deskripsi), R.drawable.ikan_hiu));
        ikans.add(new Ikan(ctx.getString(R.string.guppy_nama), ctx.getString(R.string.guppy_asal),
                ctx.getString(R.string.guppy_deskripsi), R.drawable.guppy));
        ikans.add(new Ikan(ctx.getString(R.string.molly_nama), ctx.getString(R.string.molly_asal),
                ctx.getString(R.string.molly_deskripsi), R.drawable.molly));
        ikans.add(new Ikan(ctx.getString(R.string.koki_nama), ctx.getString(R.string.koki_asal),
                ctx.getString(R.string.koki_deskripsi), R.drawable.koki));
        return ikans;
    }

    private static List<Serangga> DataSerangga(Context ctx) {
        List<Serangga> seranggas = new ArrayList<>();
        seranggas.add(new Serangga(ctx.getString(R.string.kepik_nama), ctx.getString(R.string.kepik_asal),
                ctx.getString(R.string.kepik_deskripsi), R.drawable.kepik));
        seranggas.add(new Serangga(ctx.getString(R.string.lebah_nama), ctx.getString(R.string.lebah_asal),
                ctx.getString(R.string.lebah_deskripsi), R.drawable.lebah));
        seranggas.add(new Serangga(ctx.getString(R.string.laba_nama), ctx.getString(R.string.laba_asal),
                ctx.getString(R.string.laba_deskripsi), R.drawable.laba_laba));
        seranggas.add(new Serangga(ctx.getString(R.string.ladygup_nama), ctx.getString(R.string.ladygup_asal),
                ctx.getString(R.string.ladygup_deskripsi), R.drawable.ladybug));
        seranggas.add(new Serangga(ctx.getString(R.string.lace_nama), ctx.getString(R.string.lace_asal),
                ctx.getString(R.string.lace_deskripsi), R.drawable.lacewings));
        return seranggas;
    }

    private static void AllHewans(Context ctx) {
        hewans.addAll(DataBurung(ctx));
        hewans.addAll(DataIkan(ctx));
        hewans.addAll(DataSerangga(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            AllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            AllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}

