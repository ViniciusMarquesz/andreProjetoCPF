import org.example.ValidadorDocumento;
import org.junit.Assert;
import org.junit.Test;

public class ValidadorDocumentoTest {

    @Test
    public void deveValidarCPFValido() {
        Assert.assertTrue(
                ValidadorDocumento.validarCPF("529.982.247-25")
        );
    }

    @Test
    public void deveInvalidarCPFInvalido() {
        Assert.assertFalse(
                ValidadorDocumento.validarCPF("111.111.111-11")
        );
    }

    @Test
    public void deveValidarCNPJValido() {
        Assert.assertTrue(
                ValidadorDocumento.validarCNPJ("04.252.011/0001-10")
        );
    }

    @Test
    public void deveInvalidarCNPJInvalido() {
        Assert.assertFalse(
                ValidadorDocumento.validarCNPJ("11.111.111/1111-11")
        );
    }

    @Test
    public void deveInvalidarCPFNuloOuVazio() {
        Assert.assertFalse(
                ValidadorDocumento.validarCPF("")
        );
    }

    @Test
    public void deveInvalidarCNPJNuloOuVazio() {
        Assert.assertFalse(
                ValidadorDocumento.validarCNPJ("")
        );
    }
}