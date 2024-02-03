package fc.java.part3;

import fc.java.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO member = new MemberDTO();
        member.name = "hong";
        member.phone = "010-1234-1234";
        // member.age = 29; // member.age는 pirvate이기 때문에 접근 할 수 없음

    }
}
