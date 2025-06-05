import org.example.GradeConverter;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GradeConverterTest {
    private GradeConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter();
    }

    // === Yêu cầu mới cho điểm A: điểm từ 90 đến 100 ===
    @Test
    public void testScore100ShouldBeA() {
        assertEquals("A", converter.convert(100)); // Mã gốc: PASS
    }

    @Test
    public void testScore90ShouldBeA_NewRequirement() {
        assertEquals("A", converter.convert(90));   // Mã gốc: FAIL (trả về "Invalid")
    }

    @Test
    public void testScore91ShouldBeA() {
        assertEquals("A", converter.convert(91));   // Mã gốc: PASS
    }

    @Test
    public void testScore95TypicalShouldBeA() { // Giá trị điển hình
        assertEquals("A", converter.convert(95));   // Mã gốc: PASS
    }

    // === Yêu cầu mới cho điểm B: điểm từ 80 đến 89 ===
    @Test
    public void testScore89ShouldBeB() {
        assertEquals("B", converter.convert(89));   // Mã gốc: PASS
    }

    @Test
    public void testScore80ShouldBeB_NewRequirement() {
        assertEquals("B", converter.convert(80));   // Mã gốc: FAIL (trả về "Invalid")
    }

    @Test
    public void testScore81ShouldBeB() {
        assertEquals("B", converter.convert(81));   // Mã gốc: PASS
    }

    @Test
    public void testScore85TypicalShouldBeB() { // Giá trị điển hình
        assertEquals("B", converter.convert(85));   // Mã gốc: PASS
    }

    // === Yêu cầu mới cho điểm C: điểm từ 70 đến 79 ===
    @Test
    public void testScore79ShouldBeC() {
        assertEquals("C", converter.convert(79));   // Mã gốc: PASS
    }

    @Test
    public void testScore70ShouldBeC_NewRequirement() {
        assertEquals("C", converter.convert(70));   // Mã gốc: FAIL (trả về "Invalid")
    }

    @Test
    public void testScore71ShouldBeC() {
        assertEquals("C", converter.convert(71));   // Mã gốc: PASS
    }

    @Test
    public void testScore75TypicalShouldBeC() { // Giá trị điển hình
        assertEquals("C", converter.convert(75));   // Mã gốc: PASS
    }

    // === Yêu cầu mới cho điểm D: điểm từ 60 đến 69 ===
    @Test
    public void testScore69ShouldBeD() {
        assertEquals("D", converter.convert(69));   // Mã gốc: PASS
    }

    @Test
    public void testScore60ShouldBeD_NewRequirement() {
        assertEquals("D", converter.convert(60));   // Mã gốc: FAIL (trả về "Invalid")
    }

    @Test
    public void testScore61ShouldBeD() {
        assertEquals("D", converter.convert(61));   // Mã gốc: PASS
    }

    @Test
    public void testScore65TypicalShouldBeD() { // Giá trị điển hình
        assertEquals("D", converter.convert(65));   // Mã gốc: PASS
    }

    // === Yêu cầu mới cho điểm E: điểm từ 0 đến 59 ===
    // (Giả định 0 cũng là E theo tinh thần "các kia tương tự")
    @Test
    public void testScore59ShouldBeE() {
        assertEquals("E", converter.convert(59));   // Mã gốc: PASS
    }

    @Test
    public void testScore0ShouldBeE_NewRequirement() {
        assertEquals("E", converter.convert(0));    // Mã gốc: FAIL (trả về "Invalid")
    }

    @Test
    public void testScore1ShouldBeE() {
        assertEquals("E", converter.convert(1));    // Mã gốc: PASS
    }

    @Test
    public void testScore30TypicalShouldBeE() { // Giá trị điển hình
        assertEquals("E", converter.convert(30));   // Mã gốc: PASS
    }

    // === Yêu cầu mới cho các trường hợp không hợp lệ: điểm < 0 hoặc điểm > 100 ===
    @Test
    public void testScoreNegativeOneShouldBeInvalid() {
        assertEquals("Invalid", converter.convert(-1)); // Mã gốc: PASS
    }

    @Test
    public void testScoreNegativeTenShouldBeInvalid() {
        assertEquals("Invalid", converter.convert(-10)); // Mã gốc: PASS
    }

    @Test
    public void testScore101ShouldBeInvalid() {
        assertEquals("Invalid", converter.convert(101)); // Mã gốc: PASS
    }

    @Test
    public void testScore150ShouldBeInvalid() { // Điểm rất cao
        assertEquals("Invalid", converter.convert(150)); // Mã gốc: PASS
    }
}