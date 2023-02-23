package bdd.scenarios;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.tr.Diyelimki;
import io.cucumber.java.tr.Eğerki;
import io.cucumber.java.tr.Ozaman;
import io.cucumber.java.tr.Ve;

public class PutPackagesToBags {
    @Diyelimki("sistemde kayıtlı belli paketler var")
    public void sistemdeKayıtlıBelliPaketlerVar(DataTable table) {
        //TODO tablodan paketler okunup PackageEntity lere doldurulacak
    }

    @Diyelimki("sistemde kayıtlı belli çantalar var")
    public void sistemdeKayıtlıVelliÇantalarVar(DataTable table) {
        //TODO tablodan çantalar okunup BagEntity lere doldurulacak
    }

    @Ve("çalışanın elinde {string} barcodelu paketler olduğu biliniyor")
    public void çalışanınElindeBag_barcodeBarcodeluPaketlerOlduğuBiliniyor(String barcode) {
        //TODO: Bag domain entitysi oluşturulup barcodeu setlenecek ve belki deliverypoint filan da eklenecek
    }

    @Ve("çalışanın elinde {string} barcodelu çantalar olduğu biliniyor")
    public void çalışanınElindePackage_barcodeBarcodeluÇantalarOlduğuBiliniyor(String barcode) {
        //TODO: Package domain entitysi oluşturulup barcode setlenecek ve belki deliverypoint filan da eklenecek
    }

    @Eğerki("çalışan paketleri çantalara yerleştirmek isterse")
    public void çalışanPaketleriÇantalaraYerleştirmekIsterse() {
        //TODO: domain entitylerdeki putPackagesToBags(List<String> packageBarcodes, List<String> bagBarcodes) metodu çağrılacak
    }

    @Ozaman("paketlerin durumu {string} olur")
    public void paketlerinDurumuPackage_stateOlur(String state) {

        //TODO: sonuçlar değerlendirilecek ASSERTION
    }
}
