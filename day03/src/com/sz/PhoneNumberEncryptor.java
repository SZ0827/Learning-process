package com.sz;
//提高手机号码随机生成13位校验码，不同手机号不同，相同手机号相同
public class PhoneNumberEncryptor {
    // 散列参数：大质数用于增加散列均匀性
    private static final long PRIME = 987654321L; // 乘数
    private static final long OFFSET = 123456789L; // 偏移量
    private static final long MOD = 10000000000000L; // 13位模数（10^13）

    public static String encryptPhone(String phone) {
        // 输入校验
        if (phone == null || !phone.matches("\\d{11}")) {
            throw new IllegalArgumentException("手机号必须是11位数字");
        }

        // 将手机号转为长整型
        long phoneNum = Long.parseLong(phone);

        // 散列计算：(phone * PRIME + OFFSET) % MOD
        long hashed = (phoneNum * PRIME + OFFSET) % MOD;

        // 确保13位，若不足前面补0
        return String.format("%013d", hashed);
    }

    // 测试方法
    public static void main(String[] args) {
        String[] phones = {
                "13812345678", // 不同手机号
                "13912345678",
                "13812345679",
                "13000000000",
                "13812345678"  // 相同手机号测试确定性
        };

        for (String phone : phones) {
            String id = encryptPhone(phone);
            System.out.println(phone + " -> " + id);
        }

        // 验证唯一性（简单检查）
        java.util.Set<String> ids = new java.util.HashSet<>();
        for (String phone : phones) {
            ids.add(encryptPhone(phone));
        }
        System.out.println("唯一ID数: " + ids.size() + " (应等于不同手机号数)");
    }
}
