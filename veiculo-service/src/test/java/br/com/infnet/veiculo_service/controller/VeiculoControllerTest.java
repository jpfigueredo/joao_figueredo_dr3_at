package br.com.infnet.veiculo_service.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest
@AutoConfigureMockMvc
public class VeiculoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAllVeiculos() throws Exception {
//        mockMvc.perform(get("/api/veiculos"))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    public void testAddVeiculo() throws Exception {
//        Veiculo veiculo = new Veiculo("Honda", "Civic", 2020);
//        mockMvc.perform(post("/api/veiculos")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(asJsonString(veiculo)))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.marca").value("Honda"));
    }

    private static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
