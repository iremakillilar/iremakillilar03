package com.example.irem.kotlinarraybook4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main4.*

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)


        var sayfa = 1
        var sayfalar = arrayOf(R.drawable.denge, R.drawable.adalet, R.drawable.degnekkralice, R.drawable.gunes, R.drawable.kadercarki,R.drawable.kilicuclusu,R.drawable.tilsimyedilisi,R.drawable.asalarusagi,R.drawable.imparatorice,R.drawable.asalarinbeslisi)
        var metinler = arrayOf("DENGE: \n \n  Bu kartı seçen kişiden orta bir yol bulunması için uzlaşmacı bir tavır beklenir. Ana temel, orta yolu bulmaktır, dengeyi kurmaktır. Bu kart, doğru uyuma işaret eder. Bu kartı seçen kişi, zor bir ikilem yaşarsa inançlarını pratiğe dökmek zorunda kalabilir.\n" +
                " \n  TERS: \n \n Bu kartı seçen kişinin davranışları çok abartılıdır. Bu aşırılık, kimseyle uzlaşamama, orta yolu bulamama anlamına gelir. Bu kişi, çok sabırsızdır ve her laftan bir mana çıkarır. Dengenin sağlanması için uzlaşma yoluna gitmeniz iyi olacaktır. ","ADALET: \n \n Dengeyi ve olumlu kararları simgeler. Özellikle hayatın dengesi bu kartı ifade eder. Kartı seçen kişi, kalp, zihin, ruh sağlığı için eşit zaman garantisiyle hayatını düzenlemeye başlar. Bu kişi adaleti sağlamak için iç dürtülerini kullanır. “Ne ekersen onu biçersin” adalet kartının temel anlamıdır. \n" +
                "\n TERS: \n \n  Adaletsizlik, dengesizlik anlamlarını taşır. Bu kartı seçen kişi haksızlık ve ön yargılı tavırla karşılaşabilir. Merhametsiz ve ön yargılı biriyle karşılaşabilir. Bu kartı seçen kişi iç sesini dinlemez, duygu, düşünce, iş ve eğlence yaşamında dengesizlik vardır.","ASALARIN KRALİÇESİ: \n \n Sosyal hayat, politika, spor ve yaratıcılık isteyen alanlarda sürekli bir gelişim isteği vardır. Aile ve arkadaşlarınız içinde sevilen ve imrenilen biri olmak bu tür isteklerden ve yeteneklerden ileri gelmektedir. Zaten bunlar büyük ölçüde başarılmış şeylerdir. Başarı ve daha iyiye ulaşma iş ve özel hayatta motivasyonu getirmektedir. \n \n TERS: \n \n Bu kart olumsuz gelişmeleri haber vermektedir, kandırma ve aldanmayı temsil eder. Bencillik kendini fazlasıyla gösterir. Bilgileri saptırır olayları aldatıcı bir şekilde yansıtır. \n" +
                "\n","GÜNEŞ: \n \n Yeniden doğuş anlamını taşır. Bu kart, başarı ve mutluluğu getirir. Eğitimde, kariyer ve sanatsal alanda başarı sağlanacağı anlamına gelir. Liderlik kavramı bu kartla bağdaştırılır. Sorunların üstesinden gelinir adeta yeniden doğulur. Bu yeniden doğuş fiziksel değişimle de kendini gösterir. Öz güven bu kartın simgesidir.\n \n TERS: \n \n Hayal kırıklığı, hüsranla sonuçlanmış olaylar ve tatminsizlik anlamını taşır. Bu olumsuz olayları olumluya çevirme yetisi yoktur. Yenilgiler bu kartı seçen kişiyi bezdirebilir. İlişki ve evlilikte sorunlar yaşanabilir.","KADER ÇARKI: \n \n Ödüllere ve fırsatlara işarettir. Bu kartı seçen kişi olayları kendi lehine çevirebilir. Bu kart, başarıyı simgeler. Pek çok fırsat doğacak anlamına gelir.\n" +
                "\n TERS: \n  \n Ertelemeler ve problemler meydana gelir. Bu kartı seçen kişi, çok çalışır ama bir ilerleme kaydedemez. Bir hatayı tekrarlamak olasıdır. Fırsatlar iyi değerlendirilemez.\n" +
                "\n"," KILIÇLARIN ÜÇLÜSÜ: \n \n Dramatik sahnelerin habercisi olan bu kart, hayatta bazen karşılaşmak zorunda olduğumuz talihsiz durumlara karşı uyarıcı niteliği taşır.  Şu anda hayatınızda bulunan bir durum sizden uzaklaşmaktadır. Şöyle düşünmek gerekir ki; size faydası olmayan bir şey ya da kişi hayatınızda olmamalıdır zaten.\n  \n TERS: \n \n Hissettirdiği acı daha az olan bir ayrılık sizi bekliyor. Her ne kadar sıkıntılı bir dönem olsa da hislerinizin daha az incineceğini bilmelisiniz. İlişkiler dışında da mesela bir sağlık operasyonu sizi bekliyorsa, bunda da çekeceğiniz sıkıntının boyutları daha dar olacak demektir."," TILSIMLARIN YEDİLİSİ: \n \n Başarısızlık ve tatminsizlik duygusu hâkim olabilir bu dönemde. Çok fazla önem verilen bir şey, hissettiğiniz bir memnuniyet duygusu veya bir başarıyı kaybetme olasılığınız var. İçinizden bir his sizi daha ileri hedeflere doğru itiyor olabilir. \n \n TERS: \n \nParasal sıkıntıların, kaygı ve şüphelerin ve borç ödemeleri gibi yoğun olarak yaşanmaya başladığı ya da yaşanacağı bir dönemdesiniz. Tüm bunları sürekli olarak düşünmek sizi olmak istemediğiniz duruma hapsetmektedir.","ASALARIN UŞAĞI: \n\n Gayret, hırs, cesaret, enerji ve kişilik bu karta özgü unsurladır. Herkesin içinde fark edilmeyi ve doğal liderlik yeteneklerinizi sergilemeyi seviyorsunuz. Eğer ki, içinde bulunduğunuz yeni bir durum varsa bu konuda kararlı ve risk alır konumda olduğunuzu söylemek mümkün. \n \n  TERS: \n\n Bazen ilgi görme ve sevilme ihtiyacından ötürü sizi rahatsız edecek davranışlarla karşılaşabilirsiniz. İçinizdeki fark edilme tutkusu sizi de yapmacık ve sevimsiz davranışlar sergilemeye itebilir, dikkatli olmalısınız. Genel anlamda sizi pek de memnun etmeyecek haberlere hazırlıklı olmalısınız."
                , "İMPARATORİÇE: \n\n Aşka işaret eder, evlilik kartı olabilir. Duygusallığa, aşka, sevgiye, sevilmeye dikkat çeker. Ayrıca bu kart, anneliği ifade eder. Bu kartı seçen kadın; duygusal, ruhsal, psikolojik, zihinsel ve ekonomik açıdan güçlerine önem verir. Dekorasyon ve yaratıcı işler kendini gösterir. \n  \n TERS: \n \n  Bu kartın ters olması sakinliğe işaret eder. Sevgi, mutluluk için şarttır. Psikolojik problemler olduğunu ifade eder. Mutsuz bir kadını simgeler. Bu kartı seçen kişi ilişkilerde ve anne olmakta kendini başarısız hissedebilir. Boşanma ve ihanet ortaya çıkabilir.", "ASALARIN BEŞLİSİ: \n \n Bu kartın hâkim olduğu duygu rekabet ve çekişmedir. Karşılaşma olasılığınız olan tartışma ve kışkırtmalara karşı güçlü durmanız faydanıza olacaktır. İş, aşk ya da aile yaşamınızda ciddi uyuşmazlıklar ve düşünce ayrılıkları yaşanabilir. \n  \n TERS: \n\n Ciddi tartışmalar ve anlaşmazlıkların sona ereceği bir dönemdesiniz. Bu bitiş ise yeni başlangıçların ilk adımı durumundadır. Rutin akışın yerini daha yenilikçi yaklaşımlar alacaktır. Fiziksel olarak sağlık ve sporla gelen yenilenme bu döneminizin önemli ayrıntılarıdır.")
        metinTutucu.setText(metinler[0])

        ileriButon.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                if(sayfa < sayfalar.size) {
                    sayfa++
                    Log.d("Dizi", sayfalar[sayfa-1].toString())
                    sayfaTutucu.setImageResource(sayfalar[sayfa-1])
                    metinTutucu.setText(metinler[sayfa-1])
                } else {
                    Toast.makeText(this@Main4Activity, "Son sayfadasınız..!",
                            Toast.LENGTH_LONG).show()
                }
            }
        })

        geriButon.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                if(sayfa > 1) {
                    sayfa--
                    Log.d("Dizi", sayfalar[sayfa-1].toString())
                    sayfaTutucu.setImageResource(sayfalar[sayfa-1])
                    metinTutucu.setText(metinler[sayfa-1])
                } else {
                    Toast.makeText(this@Main4Activity, "İlk sayfadasınız..!",
                            Toast.LENGTH_LONG).show()
                }
            }
        })

    }

}