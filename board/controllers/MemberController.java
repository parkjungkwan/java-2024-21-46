package board.controllers;

import board.services.MemberService;
import board.impls.MemberServiceImpl;
import board.domains.TeacherDto;
import board.domains.MemberDto;

public class MemberController {
    private MemberService memberService;
    public MemberController(){
        memberService = new MemberServiceImpl();
    }
    public void postStudent(MemberDto student){
        memberService.registerStudent(student);
    }
    public void postTeacher(MemberDto teacher){
        memberService.registerTeacher(teacher);
    }
    public void updateStudent(MemberDto student){
        memberService.modifyStudent(student);
    }
    public void deleteStudent(MemberDto student){
        memberService.removeStudent(student);
    }
    public MemberDto postLogin(MemberDto student){
        return memberService.login(student);
    }
    public MemberDto postAccess(TeacherDto teacher){
        return memberService.access(teacher);
    }
    public MemberDto[] getStudentList(){
        return memberService.fetchStudentList();
    }
    public MemberDto getStudentDetail(String userId){
        return memberService.fetchStudentDetail(userId);
    } 
    public boolean getExistId(String userid){
        return memberService.existId(userid);
    }
}

















