## Java Thread and Multithreading
Java'da bir iş parçacığı, bir program yürütülürken izlenen yoldur. Tüm Java programlarının, ana iş parçacığı ile main() yöntemi çağrıldığında, programın başlangıcında Java Sanal Makinesi (JVM) tarafından oluşturulan ana iş parçacığı olarak bilinen en az bir iş parçacığı vardır.
Java'da, bir iş parçacığı oluşturma, bir arabirim uygulayarak ve bir sınıfı genişleterek gerçekleştirilir. Her Java iş parçacığı, java.lang.Thread sınıfı tarafından oluşturulur ve kontrol edilir.
Tek iş parçacıklı bir uygulama yalnızca bir iş parçacığına sahiptir ve aynı anda yalnızca bir görevi işleyebilir. Birden çok görevi paralel olarak işlemek için çoklu iş parçacığı kullanılır, her biri farklı bir görev gerçekleştiren birden çok iş parçacığı oluşturulur.

Çoklu iş parçacığı, uygulamanın paralel olarak yürütmek için küçük bir görev birimi oluşturabileceği bir programlama konseptidir. Bir bilgisayarda çalışıyorsanız, birden fazla uygulama çalıştırır ve bunlara işlem gücü tahsis eder. Basit bir program sırayla çalışır ve kod ifadeleri birer birer yürütülür.
Programlama dili birden çok iş parçacığı oluşturmayı destekliyorsa ve bunları paralel olarak çalışması için işletim sistemine iletirse, buna çoklu iş parçacığı denir.

## Java'da Synchronized
Çok iş parçacıklı programlar genellikle birden çok iş parçacığının aynı kaynaklara erişmeye çalıştığı ve sonunda hatalı ve öngörülemeyen sonuçlar ürettiği bir duruma gelebilir. Bu nedenle, belirli bir zamanda kaynağa yalnızca bir iş parçacığının erişebileceğinden bazı senkronizasyon yöntemleriyle emin olunması gerekir.
Java, senkronize bloklar kullanarak iş parçacıkları oluşturmanın ve görevlerini senkronize etmenin bir yolunu sağlar. Java'daki senkronize bloklar, synchronized anahtar sözcüğü ile işaretlenir.
Java'da senkronize edilmiş bir blok, bazı nesnelerde senkronize edilir. Aynı nesne üzerinde senkronize edilen tüm senkronize blokların içinde aynı anda yalnızca bir iş parçacığı yürütülebilir. Senkronize bloğa girmeye çalışan diğer tüm iş parçacıkları, senkronize edilmiş blok içindeki iş parçacığı bloktan çıkana kadar engellenir.

## Thread Safety
İş parçacığı güvenliği, çok iş parçacıklı koda uygulanabilen bir bilgisayar programlama konseptidir. İş parçacığı için güvenli kod, paylaşılan veri yapılarını yalnızca tüm iş parçacıklarının düzgün davranmasını ve tasarım özelliklerini istenmeyen etkileşim olmadan yerine getirmesini sağlayacak şekilde işler.

## Multithreading Avantajları
- Azaltılmış geliştirme süresiyle artırılmış performans
- Basitleştirilmiş ve aerodinamik program kodlama
- Görevlerin eşzamanlı ve paralel olarak ortaya çıkması
- Kaynakların kullanımıyla önbellek depolamasının daha iyi kullanılması
- CPU kaynağının daha iyi kullanımı

## Multithreading Dezavantajları
- Karmaşık hata ayıklama ve test süreçleri
- Deadlock oluşumu için artan potansiyel
- Program yazarken artan zorluk seviyesi
- Öngörülemeyen sonuçlar

### Referanslar
[multithreading](https://www.journaldev.com/1079/multithreading-in-java ) <br/>
[synchronized](https://www.geeksforgeeks.org/synchronized-in-java/)  <br/>
[advantages-and-disadvantages](https://www.multisoftvirtualacademy.com/blog/common-advantages-and-disadvantages-of-multithreading-in-java/)  <br/>
[thread-safety](https://www.baeldung.com/java-thread-safety)
