package com.example.datastructer

import androidx.compose.runtime.*
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.platform.LocalContext

// Tutorial steps for each screen
object ScreenTutorials {

    fun getRedBlackTreeTutorial(): List<TutorialStep> = listOf(
        TutorialStep(
            title = "Red-Black Tree 🔴⚫",
            description = "Red-Black Tree, dengeli bir ikili arama ağacıdır. Her düğüm kırmızı veya siyah renge sahiptir ve belirli kurallara uyar."
        ),
        TutorialStep(
            title = "Değer Ekleme ➕",
            description = "Üst paneldeki giriş alanına bir sayı yazın ve '+' butonuna tıklayarak ağaca ekleyin. Ağaç otomatik olarak dengelenecektir."
        ),
        TutorialStep(
            title = "Değer Silme ➖",
            description = "Silmek istediğiniz değeri girin ve 'çöp kutusu' ikonuna tıklayın. Ağaç yeniden dengelenecektir."
        ),
        TutorialStep(
            title = "Yakınlaştırma/Uzaklaştırma 🔍",
            description = "Büyütme ve küçültme butonları ile ağacı daha iyi görebilirsiniz. Sıfırla butonu ile görünümü varsayılana döndürebilirsiniz."
        ),
        TutorialStep(
            title = "Açıklamalar 💡",
            description = "Alt panelde her işlemin detaylı açıklamasını görebilirsiniz. Bu sayede algoritmanın nasıl çalıştığını anlayabilirsiniz."
        )
    )

    fun getAVLTreeTutorial(): List<TutorialStep> = listOf(
        TutorialStep(
            title = "AVL Tree ⚖️",
            description = "AVL Tree, her düğümde yükseklik dengesi sağlayan otomatik dengeli bir ikili arama ağacıdır."
        ),
        TutorialStep(
            title = "Denge Faktörü 📊",
            description = "Her düğümün sol ve sağ alt ağaçlarının yükseklik farkı en fazla 1'dir. Bu sayede arama işlemleri hızlı kalır."
        ),
        TutorialStep(
            title = "Rotasyon İşlemleri 🔄",
            description = "Ekleme veya silme sonrası denge bozulursa, tek veya çift rotasyon ile ağaç yeniden dengelenir."
        ),
        TutorialStep(
            title = "Kontrol Paneli 🎮",
            description = "Değer eklemek, silmek ve ağacı görselleştirmek için üst paneli kullanın. Zoom butonları ile görünümü ayarlayın."
        )
    )

    fun getSplayTreeTutorial(): List<TutorialStep> = listOf(
        TutorialStep(
            title = "Splay Tree 🌳",
            description = "Splay Tree, son erişilen elemanı köke taşıyan kendi kendini düzenleyen bir ağaç yapısıdır."
        ),
        TutorialStep(
            title = "Splay Operasyonu ⚡",
            description = "Her erişim, ekleme veya silme işleminde, ilgili düğüm rotasyonlar ile köke taşınır."
        ),
        TutorialStep(
            title = "Sık Kullanılan Veriler 📈",
            description = "Sık erişilen veriler köke yakın olur, bu da cache benzeri bir davranış sağlar."
        ),
        TutorialStep(
            title = "İşlemler 🛠️",
            description = "Değer ekleyin veya silin ve splay işleminin ağacı nasıl yeniden yapılandırdığını gözlemleyin."
        )
    )

    fun getMaxHeapTutorial(): List<TutorialStep> = listOf(
        TutorialStep(
            title = "Max Heap 🔺",
            description = "Max Heap, her ebeveyn düğümün çocuklarından büyük veya eşit olduğu tam ikili ağaç yapısıdır."
        ),
        TutorialStep(
            title = "En Büyük Eleman Kökde 👑",
            description = "Heap'in kök düğümü her zaman en büyük elemanı içerir. Bu sayede maksimumu hızlıca bulabilirsiniz."
        ),
        TutorialStep(
            title = "Ekleme İşlemi ➕",
            description = "Yeni eleman sona eklenir ve yukarı doğru 'bubble up' işlemi ile doğru konumuna yerleştirilir."
        ),
        TutorialStep(
            title = "Çıkarma İşlemi ➖",
            description = "'Extract Max' butonu ile kök elemanı çıkarabilirsiniz. Son eleman köke taşınır ve 'bubble down' ile yeniden düzenlenir."
        ),
        TutorialStep(
            title = "Heap Property 🔄",
            description = "Her işlemde heap özelliği korunur. Alt paneldeki açıklamaları takip edin."
        )
    )

    fun getHashTableTutorial(): List<TutorialStep> = listOf(
        TutorialStep(
            title = "Hash Table 🗂️",
            description = "Hash Table, anahtar-değer çiftlerini saklayan ve hızlı erişim sağlayan bir veri yapısıdır."
        ),
        TutorialStep(
            title = "Hash Fonksiyonu 🔢",
            description = "Her değer bir hash fonksiyonu ile tabloda bir indekse eşlenir. Bu sayede O(1) erişim sağlanır."
        ),
        TutorialStep(
            title = "Çakışma Çözümleme 🔧",
            description = "Üç farklı yöntem seçebilirsiniz: Linear Probing, Quadratic Probing, Double Hashing."
        ),
        TutorialStep(
            title = "Çakışma Durumları ⚠️",
            description = "İki değer aynı indekse hash'lenirse, seçili yöntemle boş yer bulunur. Bu süreci görsel olarak takip edin."
        ),
        TutorialStep(
            title = "Silme İşlemi 🗑️",
            description = "Silinen elemanlar 'DELETED' olarak işaretlenir ve probing zinciri bozulmaz."
        )
    )

    fun getHuffmanCodingTutorial(): List<TutorialStep> = listOf(
        TutorialStep(
            title = "Huffman Kodlama 📝",
            description = "Huffman Kodlama, veri sıkıştırma için kullanılan optimal bir prefix kodlama algoritmasıdır."
        ),
        TutorialStep(
            title = "Metin Girişi ✍️",
            description = "Kodlamak istediğiniz metni giriş alanına yazın. Algoritma her karakterin frekansını hesaplayacaktır."
        ),
        TutorialStep(
            title = "Frekans Tablosu 📊",
            description = "Her karakterin kaç kez geçtiği sayılır ve bir frekans tablosu oluşturulur."
        ),
        TutorialStep(
            title = "Huffman Ağacı 🌲",
            description = "En düşük frekanslı düğümler birleştirilerek bir ağaç oluşturulur. Sık kullanılan karakterler kısa kod alır."
        ),
        TutorialStep(
            title = "Kodlama Sonuçları 💾",
            description = "Her karakter için ikili kod ve sıkıştırma oranını göreceksiniz. Sol 0, sağ 1 ile kodlanır."
        )
    )

    fun getGraphAlgorithmsTutorial(): List<TutorialStep> = listOf(
        TutorialStep(
            title = "Graph Algoritmaları 🕸️",
            description = "Graf yapıları ve temel graf algoritmaları ile çalışabilirsiniz."
        ),
        TutorialStep(
            title = "Düğüm ve Kenar Ekleme ➕",
            description = "Graf'a düğüm ekleyin ve düğümler arası bağlantılar oluşturun. Kenar ağırlıkları belirleyebilirsiniz."
        ),
        TutorialStep(
            title = "BFS - Genişlik Öncelikli Arama 🌊",
            description = "Başlangıç düğümünden itibaren katman katman graf'ı dolaşır. En kısa yol bulmak için kullanılır."
        ),
        TutorialStep(
            title = "DFS - Derinlik Öncelikli Arama 🏔️",
            description = "Bir dalı sonuna kadar takip eder, sonra geri döner. Döngü tespiti ve topolojik sıralama için kullanılır."
        ),
        TutorialStep(
            title = "Dijkstra Algoritması 🗺️",
            description = "Ağırlıklı graf'ta en kısa yolu bulur. Başlangıç ve bitiş düğümü seçerek çalıştırın."
        ),
        TutorialStep(
            title = "Görselleştirme 🎨",
            description = "Algoritma adımlarını renklerle takip edin: Ziyaret edilen, keşfedilen ve en kısa yol üzerindeki düğümler farklı renklerde görünür."
        )
    )
}

// Composable function to show tutorial for a specific screen
@Composable
fun ShowScreenTutorial(
    screenName: String,
    steps: List<TutorialStep>,
    onComplete: () -> Unit
) {
    val context = LocalContext.current
    var showTutorial by remember {
        mutableStateOf(!TutorialPreferences.isTutorialCompleted(context, screenName))
    }

    if (showTutorial) {
        TutorialOverlay(
            steps = steps,
            onComplete = {
                TutorialPreferences.setTutorialCompleted(context, screenName)
                showTutorial = false
                onComplete()
            },
            onSkip = {
                TutorialPreferences.setTutorialCompleted(context, screenName)
                showTutorial = false
                onComplete()
            }
        )
    }
}
