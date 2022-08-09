package test.mypac;

public class MacBook {
	//외부에서 접근 불가하도록 접근 지정자를 private 로 해서 필드 3개 선언하기
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	//null 이 들어가있다.
	//private 는 new를 class 안에서만 할수있다. 패키지 같아도 new가 안됨
	
	//생성자 , 기본 생성자가 아니므로 new MacBook() 으로 객체생성이 안됨
	public MacBook(Cpu cpu, Memory memory, HardDisk hardDisk) {
		this.cpu=cpu;
		this.memory=memory;
		this.hardDisk=hardDisk;
	}
	//메소드
	public void doGame() {
		if(this.cpu==null || memory==null || hardDisk==null) {
			System.out.println("부품이 부족해서 맥북이 동작을 할수 없습니다.");
			return; //메소드를 여기서 끝내기
		}
		System.out.println("신나게 게임을 해요!");
	}
}
