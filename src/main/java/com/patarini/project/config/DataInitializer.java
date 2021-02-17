package com.patarini.project.config;

import com.patarini.project.model.Paytoll;
import com.patarini.project.model.Role;
import com.patarini.project.model.User;
import com.patarini.project.service.AuthService;
import com.patarini.project.service.PaytollService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Component
public class DataInitializer {

    public static final String ADMIN = "admin";

    private final AuthService authService;
    private final PaytollService paytollService;

    public DataInitializer(AuthService authService, PaytollService paytollService) {
        this.authService = authService;
        this.paytollService = paytollService;
    }


    @PostConstruct
    public void initData() {
        User admin = this.authService.register(ADMIN, "ADMIN@MAIL.COM", ADMIN, ADMIN, Role.ROLE_ADMIN);
        User user = this.authService.register("user", "user@mail.com", "user", "user", Role.ROLE_USER);
        Optional<Paytoll> p1 = this.paytollService.save("Romanovci", "42.1100017", "21.6989402",
                "Kumanovo", "Miladinovci", 40, 0.5, 60, 1, 80, 1.5, 150, 2.5, 220, 4, "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2959.881639555995!2d21.69674615125673!3d42.1100056587461!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x0!2zNDLCsDA2JzM2LjAiTiAyMcKwNDEnNTYuMiJF!5e0!3m2!1sen!2smk!4v1612198262695!5m2!1sen!2smk");
        Optional<Paytoll> p2 = this.paytollService.save("Petrovec", "41.9420158", "21.6196826",
                "Skopje", "Petrovec", 20, 0.5, 40, 1, 50, 1, 100, 2, 150, 3, "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2967.7129224664914!2d21.617488551252734!3d41.94201976928815!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x0!2zNDHCsDU2JzMxLjMiTiAyMcKwMzcnMTAuOSJF!5e0!3m2!1sen!2smk!4v1612198461606!5m2!1sen!2smk");
        Optional<Paytoll> p3 = this.paytollService.save("Sopot", "41.784217", "21.7160976",
                "Veles", "Petrovec", 50, 1, 80, 1.5, 120, 2, 220, 4, 330, 5.5, "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2975.0460603077267!2d21.713903551249285!3d41.78422097916052!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x0!2zNDHCsDQ3JzAzLjIiTiAyMcKwNDInNTguMCJF!5e0!3m2!1sen!2smk!4v1612199001338!5m2!1sen!2smk");
        Optional<Paytoll> p4 = this.paytollService.save("Otovica", "41.778482", "21.7653559",
                "Veles", "Petrovec", 50, 1, 80, 1.5, 120, 2, 220, 4, 330, 5.5, "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2975.3121493902377!2d21.763167215661028!3d41.77848597962067!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x13542c23ffc9cb45%3A0x7b538fc518345243!2sToll%20booth%20Veles!5e0!3m2!1sen!2smk!4v1612199062171!5m2!1sen!2smk");
        Optional<Paytoll> p5 = this.paytollService.save("Stobi", "41.9450671", "21.5997645",
                "Veles", "Gradsko", 40, 0.5, 60, 1, 100, 2, 180, 3, 260, 4.5, "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2967.5709021236808!2d21.597575815664865!3d41.94507106919904!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x0!2zNDHCsDU2JzQyLjIiTiAyMcKwMzUnNTkuMiJF!5e0!3m2!1sen!2smk!4v1612199110270!5m2!1sen!2smk");
        Optional<Paytoll> p6 = this.paytollService.save("Miladinovci", "41.9833882", "21.6392684",
                "Skopje", "Miladinovci", 20, 0.5, 40, 1, 60, 1, 100, 2, 150, 2.5, "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2965.786560458399!2d21.637079715665838!3d41.983392166797145!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x0!2zNDHCsDU5JzAwLjIiTiAyMcKwMzgnMjEuNCJF!5e0!3m2!1sen!2smk!4v1612199202817!5m2!1sen!2smk");
        Optional<Paytoll> p7 = this.paytollService.save("Tetovo", "41.98544", "20.9809275",
                "Tetovo", "Gostivar", 20, 0.5, 30, 0.5, 40, 1, 80, 1.5, 110, 2, "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d9975.077277348626!2d20.970375161596323!3d41.98722074698032!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x0!2zNDHCsDU5JzA3LjYiTiAyMMKwNTgnNTEuMyJF!5e0!3m2!1sen!2smk!4v1612199261401!5m2!1sen!2smk");
        Optional<Paytoll> p8 = this.paytollService.save("Gostivar", "41.974168", "20.9535384",
                "Tetovo", "Gostivar", 20, 0.5, 30, 0.5, 40, 1, 80, 1.5, 110, 2, "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2966.2074571104026!2d20.952733735517317!3d41.974355422341354!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x1353fa647f850f57%3A0x98a31c6608d6f37d!2sPay%20Toll%20Tetovo%20-%20Gostivar!5e0!3m2!1sen!2smk!4v1612199362563!5m2!1sen!2smk");
        Optional<Paytoll> p9 = this.paytollService.save("Glumovo", "41.9848545", "21.30146",
                "Skopje", "Tetovo", 20, 0.5, 40, 1, 60, 1, 110, 2, 160, 3, "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d5931.485925510885!2d21.29798385534392!3d41.984328128618145!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x0!2zNDHCsDU5JzA1LjUiTiAyMcKwMTgnMDUuMyJF!5e0!3m2!1sen!2smk!4v1612199394662!5m2!1sen!2smk");
        Optional<Paytoll> p10 = this.paytollService.save("Zhelino", "41.9899086", "21.0749118",
                "Skopje", "Tetovo", 20, 0.5, 40, 1, 60, 1, 110, 2, 160, 3, "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2965.4828196086874!2d21.072723115665983!3d41.98991256638807!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x1353f7c413703b7f%3A0xb60b02099d2d85ee!2sPay%20Toll%20Tetovo%20-%20Skopje!5e0!3m2!1sen!2smk!4v1612199422866!5m2!1sen!2smk");
        Optional<Paytoll> p11 = this.paytollService.save("Demir Kapija", "41.5949625", "21.9096454",
                "Gradsko", "Demir Kapija", 50, 1, 80, 1.5, 130, 2.5, 230, 4, 340, 6, "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3548.3846359933486!2d21.90892625892345!3d41.59469182693486!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x13567ea6a6cc3aff%3A0x66b1f31718771c47!2sPay%20toll%20Gradsko!5e0!3m2!1sen!2smk!4v1612199456317!5m2!1sen!2smk");
        Optional<Paytoll> p12 = this.paytollService.save("Gevgelija", "41.243228", "22.4830062",
                "Demir Kapija", "Gevgelija", 60, 1, 100, 2, 160, 3, 290, 5, 430, 7, "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d10091.199235355878!2d22.479270874073983!3d41.24069378638479!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x0!2zNDHCsDE0JzM1LjYiTiAyMsKwMjgnNTguOCJF!5e0!3m2!1sen!2smk!4v1612199504995!5m2!1sen!2smk");
        Optional<Paytoll> p13 = this.paytollService.save("Kadrifakovo", "41.8081898", "22.0430274",
                "Shtip", "Sveti Nikole", 30, 0.5, 50, 1, 80, 1.5, 150, 2.5, 220, 4, "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d4205.803240245696!2d22.04006101053322!3d41.80779462104699!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x1355cf481e627679%3A0xf75932f44e1ddf!2sPay%20Toll%20Kadrifakovo!5e0!3m2!1sen!2smk!4v1612199536671!5m2!1sen!2smk");
        Optional<Paytoll> p14 = this.paytollService.save("Preod", "41.919966", "21.8631798",
                "Sveti Nikole", "Miladinovci", 40, 0.5, 70, 1.5, 100, 2, 180, 3, 270, 4.5, "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2968.7523329913893!2d21.86424195299038!3d41.919682578569514!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x1355cbf7dbcfc87f%3A0x78a66752a677f60e!2sPay%20Toll%20Preod!5e0!3m2!1sen!2smk!4v1612199571194!5m2!1sen!2smk");
        Optional<Paytoll> p15 = this.paytollService.save("Miravci 1", "41.303413", "22.427749",
                "Miravci", "Demir Kapija", 30, 0.5, 60, 1, 90, 1.5, 160, 2.5, 240, 4, "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d5040.755537620915!2d22.424390254691733!3d41.30339913943947!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x0!2zNDHCsDE4JzEyLjMiTiAyMsKwMjUnMzkuOSJF!5e0!3m2!1sen!2smk!4v1612199608808!5m2!1sen!2smk");
        Optional<Paytoll> p16 = this.paytollService.save("Miravci 2", "41.303413", "22.427749",
                "Miravci", "Gevgelija", 30, 0.5, 50, 1, 70, 1.5, 130, 2, 190, 3, "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d5040.755537620915!2d22.424390254691733!3d41.30339913943947!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x0!2zNDHCsDE4JzEyLjMiTiAyMsKwMjUnMzkuOSJF!5e0!3m2!1sen!2smk!4v1612199608808!5m2!1sen!2smk");
        Optional<Paytoll> p17 = this.paytollService.save("Smokvica 1", "41.243228", "22.4830062",
                "Smokvica", "Gevgelija", 20, 0.5, 30, 0.5, 50, 1, 90, 1.5, 140, 2.5, "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d12000.290507911666!2d22.47588495401182!3d41.241975873790686!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x13561987c7500835%3A0xc5253dbf362ffec3!2sPay%20Toll%20Smokvica!5e0!3m2!1sen!2smk!4v1612199647922!5m2!1sen!2smk");
        Optional<Paytoll> p18 = this.paytollService.save("Smokvica 2", "41.243228", "22.4830062",
                "Smokvica", "Demir Kapija", 40, 0.5, 70, 1.5, 110, 2, 200, 3.5, 290, 5, "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d12000.290507911666!2d22.47588495401182!3d41.241975873790686!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x13561987c7500835%3A0xc5253dbf362ffec3!2sPay%20Toll%20Smokvica!5e0!3m2!1sen!2smk!4v1612199647922!5m2!1sen!2smk");
    }
}
