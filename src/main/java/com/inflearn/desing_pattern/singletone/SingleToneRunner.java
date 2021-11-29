package com.inflearn.desing_pattern.singletone;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

//@Component
public class SingleToneRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

//        Settings settings_1 = Settings.getINSTANCE();
//        Settings settings_2 = null;

        AnotherSettings settings_1 = AnotherSettings.INSTANCE;

        /* 리플렉션으로 생성자 활성화 시키기 */
        /*
        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        settings_2 = constructor.newInstance(null);
        */

        /* 직렬화&역직렬화 */
        /*
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("settings.obj"))){
            out.writeObject(settings_1);
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("settings.obj"))){
            settings_2 = (Settings) in.readObject();
        }
         */

//        System.out.println(settings_1 == settings_2);
    }
}
