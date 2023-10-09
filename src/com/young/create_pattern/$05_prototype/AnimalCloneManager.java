package com.young.create_pattern.$05_prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @A-作者 young
 * @D-时间 2023-09-13 18:07
 * @E-邮箱 PlutoYcr520@outlook.com
 * * -
 * @S-描述 :
 * * - 克隆管理器
 * * -
 */
public class AnimalCloneManager {

    private Map<String, Animal> animalMap = new HashMap<>();

    public void addAnimal(String key, Animal animal) {
        animalMap.put(key, animal);
    }

    public Animal getClonedAnimal(String key) {
        Animal original = animalMap.get(key);
        if (original != null) {
            return original.cloneAnimal();
        }

        return null;
    }
}
