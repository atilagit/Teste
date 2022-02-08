package application2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test_7206 {

	public static void main(String[] args) throws IOException {
		String path1 = "C:\\temp\\log_da_importação.log";
		List<String> lista1 = null;
		
		lista1 = Files.lines(Paths.get(path1))
		.filter(x -> x.contains("not found categoryId in map of categories"))
		.map(x -> x.substring(x.indexOf(" - ") + 3, x.lastIndexOf(" - not found categoryId in map of categories")))
		.peek(x -> System.out.println(x))
		.collect(Collectors.toList());

		System.out.println("\n---------------\n");

		Set<String> set = new HashSet<>();
		for (String string : lista1) {
			set.add(string.split(", ")[1]);
		}
		set.forEach(x -> System.out.println(x));
		
		System.out.println("\n---------------\n");
		System.out.println(lista1.size() + " produtos");
		System.out.println(set.size() + " categorias");
		
		System.out.println("\n---------------\n");
		
		List<String> produtos1 = lista1.stream()
		.map(x -> "\"dfsp" + x.split("],")[0].substring(8) + "\"")
		.collect(Collectors.toList());
		
		System.out.println(produtos1);
		
		List<String> produtos2 = lista1.stream()
		.map(x -> "\"dfsp" + x.split("],")[0].substring(8) + "\"")
		.map(x -> {
			if (x.endsWith("_PRD\"")) {
				return x.substring(0, x.lastIndexOf("_PRD\""))  + "\"";
			}
			return x;
		})
		.collect(Collectors.toList());
		
		System.out.println(produtos2);
		
		List<String> categorias = set.stream()
				.map(x -> "\"" + x.substring(9, x.lastIndexOf("]")) + "\"")
				.collect(Collectors.toList());
		System.out.println(categorias);
		
		var list = List.of("dfspSGUN32J430PTO", "dfspBRBPG40A2RXO", "dfspBRBPG40AQGFT", "dfspBRBPG40AVVRM", "dfspLGLHB625M", "dfspTEVBT2400BCO", "dfspBRBPG40ABBCO", "dfspBRBPG40AEPTO", "dfspAEMF032BZABCO", "dfspJBLSB150PTO", "dfsp1GA3A00138PTO", "dfspSOHTCT390PTO", "dfspSOHTNT5PTO", "dfspJBSUB100PPTO", "dfspAEMN4M2BZAPTO", "dfspAEMN4P2BZAPTA", "dfspAEMN4Q2BZADRD", "dfspAEMN4U2BZARSA", "dfspAEMN4V2BZAPTO", "dfspAEMNQM2BZAPTO", "dfspAEMNQN2BZAPTA", "dfspAEMNQP2BZADRD", "dfspAEMNQQ2BZARSA", "dfspPASCHTB580LB", "dfspSGUN78KS9000", "dfspAEMN9C2BZAPTO", "dfspAEMN0X2BRAPTA", "dfspAEMN112BRADRD", "dfspSOKDL32W655", "dfspDEI135378ACNZ", "dfsp6PBB300BCO", "dfspPWSCD62078", "dfspLGBP450PTO", "dfspPASCAKX100PTO", "dfspSOGTKXB5PTO", "dfspSGHWM4501ZPTA", "dfspL280YM0005BR", "dfspPKMAGNIFIMPTO", "dfspAEMQDY2BZARSA", "dfspUXX510URBQ167", "dfspPATC65EZ1000B", "dfspAEMQAD2BZAPTA", "dfspDEI157567A30P", "dfspL281G30000PTO", "dfspDEI135378B20C", "dfspDEI135378B40C");
		System.out.println(list.size());
	}
}
