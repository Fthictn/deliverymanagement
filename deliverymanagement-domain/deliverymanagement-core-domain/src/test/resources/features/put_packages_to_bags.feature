# language: tr
Özellik: Paketleri çantalara koymak

  Senaryo taslağı: Çalışan paketleri çantalara koymak istedi
    Diyelim ki sistemde kayıtlı belli paketler var

      | package_barcode | delivery_point      | state   |
      | P8988000122     | distribution_center | created |
      | P8988000126     | distribution_center | created |
      | P8988000127     | branch              | created |
      | P9988000129     | distribution_center | created |


    Diyelim ki sistemde kayıtlı belli çantalar var

      | bag_barcode | delivery_point      | state   |
      | C725799     | distribution_center | created |
      | C725799     | distribution_center | created |
      | C725799     | distribution_center | created |
      | C725800     | transfer_center     | created |

    Ve çalışanın elinde <bag_barcode> barcodelu paketler olduğu biliniyor

    Ve çalışanın elinde <package_barcode> barcodelu çantalar olduğu biliniyor

    Eğer ki çalışan paketleri çantalara yerleştirmek isterse

    O zaman paketlerin durumu <package_state> olur

    Örnekler:

      | bag_barcode   | package_barcode   | package_state     |
      | "C725799"     | "P8988000122"     | "loaded_into_bag" |
      | "C725799"     | "P8988000126"     | "loaded_into_bag" |
      | "C725799"     | "P8988000127"     | "created"         |
      | "C725800"     | "P9988000129"     | "created"         |