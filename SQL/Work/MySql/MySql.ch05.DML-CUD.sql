-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
-- INSERT : 데이터 추가
-- INSERT INTO 테이블명(컬럼명1, 컬럼명2,....컬럼명n) 
--               VALUES(값1, 값2, ..., 값n)

-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


-- dept 테이블에 홍보팀을 추가하시오
select * from dept;


insert into dept(deptno, dname, loc)
values (50, '홍보팀', null);

insert into dept(deptno, dname)
values (51, '홍보팀');

insert into dept
values (52, '홍보팀', null);

-- emp 테이블에 홍보팀(deptno) 소속의 사원 송중기를 추가하시오.
-- empno : primary key, 중복 insert 안됨.
select * from emp;

insert into emp(deptno, job, ename, empno)
values(50, '사원', '송중기', 1019);

-- emp 테이블에서 영업부(deptno) 소속의 사원(job) 송사랑(ename)을 추가하시오.
-- 직급은(job)은 미정이고 입사일은(hiredate)은 오늘로 한다.
-- MySQL :
-- MySQL : SQL 변수를 이용하여 dept 테이블에서 deptno 구하기
insert into emp(deptno, job, ename, hiredate, empno)
			values (@deptno, null , '송사랑', curdate(), @empno); 


select * from emp where ename = '송사랑';

select @deptno := deptno from dept where dname = '영업부'; -- 영업부의 deptno 알아내는 코드
select @empno := max(empno) +1 from emp ;-- empno 


-- emp 테이블에 영업부(deptno=30) 소속의 과장(job) 송혜교(ename)를 추가하는 SQL문을 작성하시오. 
-- 단, 입사일은 2015-01-01 이고 커미션은 100 이다.
select * from emp;

insert into emp(empno, ename, job, hiredate, comm, deptno)
values (1020, '송혜교', '과장', '2015-01-01', 100, 30);

-- MySQL에서만 가능
select @empno := max(empno)+1 from emp; 
insert into emp( empno,    ename,    job,     hiredate, comm, deptno)
			values(@empno, '송혜교', '과장', '2015-01-01',  100, 30);
select * from emp order by empno desc;

-- Oracle, MsSql에서만 가능
insert into emp( empno,                             ename,    job,     hiredate, comm, deptno)
			values((select max(empno)+1 from emp) , '송혜교', '과장', '2015-01-01',  100, 30);
			
-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
-- UPDATE 의 기본 사용 방법
-- UPDATE : 데이터 변경(수정)
-- 
-- UPDATE 테이블명 
--    SET 컬럼명1 = 값1, 컬럼명2=값2, ... 컬럼명n=값n
--  WHERE 조건식
-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2

-- dept 테이블에서 홍보팀의 loc를 일산으로 옮기시오

select * from dept;

update dept
set loc = '일산'
where dname = '홍보팀';

-- emp 테이블에서 사원 송중기의 직책(job)을 대리로, 
-- 연봉(sal)을 1000으로, 부서를 영업부로 바꾸는 SQL문을 작성하시오.
select * from dept where dname = '영업부';

update emp
set job = '대리', sal = 1000, deptno = 30
-- select * from emp <--select 까지만 실행하면 송중기 데이터조회  update까지 실행하면 select는 주석이므로 상관 x
where ename = '송중기';


select * from emp where ename = '송중기';

-- emp 테이블에서 영업부(deptno=30) 소속의 과장 송혜교의 
-- 연봉(sal)을 700으로, 커미션(comm)을 null로 수정하는 SQL문을 작성하시오.
-- select * from emp 
where job = '과장' and deptno = 30 and ename = '송혜교';

update emp
set sal = 700, comm = null
where deptno= 30;

-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
-- DELETE 의 기본 사용 방법
-- DELETE : 데이터 삭제
-- DELETE FROM 테이블명
--  WHERE 조건식
-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2

-- dept에서 홍보팀을 삭제하시오.
delete from dept
-- select * from dept
where dname = '홍보팀';

-- emp에서 송중기와 송혜교를 삭제하시오.
delete from emp
-- select * from emp
where ename in('송중기' , '송혜교');


-- 문제 emp 테이블에서 직급(job)이 정해지지 않은 직원을 삭제하시오.
delete from emp
-- select * from emp
where job = '' or job is null;

-- 문제 emp 테이블에서 경리부에 소속된 사원들만 삭제하시오.
-- 1. SQL 변수를 이용하는 방법 : MySQL만 가능

select @deptno := deptno from dept where dname = '경리부' ;
select * from emp where deptno = @deptno;
delete from emp where deptno = @deptno;
select * from emp where deptno = @deptno;

-- 2. 서브쿼리를 이용하는 방법 : MySQL, Oracle 가능, 추천하는 방법.
-- dept 테이블에서 경리부(dname)인 부서번호(deptno)를 출력하시오
-- emp 테이블에서 deptno = 10인 직원만 출력하시오
select deptno from dept where dname = '경리부';
select * from emp where deptno = 10; 

delete from emp
-- select * from emp
select * from emp where deptno = (select deptno from dept where dname = '경리부'); -- 위에 두 문장을 하나로 합침. 


-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
-- 데이터 MERGE하기.
-- a. MERGE 기본 문법
-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2







-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
-- 미션.
-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2

-- 미션 1. 사용하여 직급(job)에 따라 급여(sal)을 아래와 같이 수정하시오.
-- 단, case~when~then을 사용하시오.
-- '부장'인 사원은 5% 인상 
-- '과장'인 사원은 10% 인상
-- '대리'인 사원은 15% 인상 
-- '사원'인 사원은 20% 인상

-- 미션 2. 급여(sal)가 500이상인 직원만 급여를 10% 인상하도록 수정하시오.

-- 미션 3. 2005년에 입사한 모든 직원의 입사일을 오늘 날짜로 수정하시오.

-- 미션 4. 50번 부서의 부서의 위치(loc)를 40번 부서의 위치(loc)로 바꾸시오.
-- 단, 값 대신에 sql 쿼리를 사용하시오.


-- 미션 5. emp 테이블에서 급여가 500미만인 사원들의 급여를 50%씩 인상(업데이트)하시오.


-- 미션 6. emp 테이블에 아이린 과 강민경, 이해리 를 추가하시오.


-- 미션 7. emp 테이블에서 직급(job)이 정해지지 않은 직원을 삭제하시오.


-- 미션 8. emp 테이블에서 경리부에 소속된 사원들만 삭제하시오.


