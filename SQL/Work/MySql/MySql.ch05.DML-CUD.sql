-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
-- INSERT : 데이터 추가
-- INSERT INTO 테이블명(컬럼명1, 컬럼명2,....컬럼명n) 
--               VALUES(값1, 값2, ..., 값n)

-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


-- dept 테이블에 홍보팀을 추가하시오
SELECT *
FROM dept;
INSERT INTO dept(deptno, dname, loc) VALUES (50, '홍보팀', NULL);
INSERT INTO dept(deptno, dname) VALUES (51, '홍보팀');
INSERT INTO dept VALUES (52, '홍보팀', NULL);

-- emp 테이블에 홍보팀(deptno) 소속의 사원 송중기를 추가하시오.
-- empno : primary key, 중복 insert 안됨.
SELECT *
FROM emp;
INSERT INTO emp(deptno, job, ename, empno) VALUES(50, '사원', '송중기', 1019);

-- emp 테이블에서 영업부(deptno) 소속의 사원(job) 송사랑(ename)을 추가하시오.
-- 직급은(job)은 미정이고 입사일은(hiredate)은 오늘로 한다.
-- MySQL :
-- MySQL : SQL 변수를 이용하여 dept 테이블에서 deptno 구하기
INSERT INTO emp(deptno, job, ename, hiredate, empno) VALUES (@deptno, NULL, '송사랑', CURDATE(), @empno);
SELECT *
FROM emp
WHERE ename = '송사랑';
SELECT @deptno := deptno
FROM dept
WHERE dname = '영업부'; -- 영업부의 deptno 알아내는 코드
SELECT @empno := MAX(empno) +1
FROM emp ;-- empno 


-- emp 테이블에 영업부(deptno=30) 소속의 과장(job) 송혜교(ename)를 추가하는 SQL문을 작성하시오. 
-- 단, 입사일은 2015-01-01 이고 커미션은 100 이다.
SELECT *
FROM emp;
INSERT INTO emp(empno, ename, job, hiredate, comm, deptno) VALUES (1020, '송혜교', '과장', '2015-01-01', 100, 30);

-- MySQL에서만 가능
SELECT @empno := MAX(empno)+1
FROM emp;
INSERT INTO emp(empno, ename, job, hiredate, comm, deptno) VALUES(@empno, '송혜교', '과장', '2015-01-01', 100, 30);
SELECT *
FROM emp
ORDER BY empno DESC;

-- Oracle, MsSql에서만 가능
INSERT INTO emp(empno, ename, job, hiredate, comm, deptno) VALUES((
SELECT MAX(empno)+1
FROM emp), '송혜교', '과장', '2015-01-01', 100, 30);
			
-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
-- UPDATE 의 기본 사용 방법
-- UPDATE : 데이터 변경(수정)
-- 
-- UPDATE 테이블명 
--    SET 컬럼명1 = 값1, 컬럼명2=값2, ... 컬럼명n=값n
--  WHERE 조건식
-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2

-- dept 테이블에서 홍보팀의 loc를 일산으로 옮기시오
SELECT *
FROM dept;
UPDATE dept SET loc = '일산'
WHERE dname = '홍보팀';

-- emp 테이블에서 사원 송중기의 직책(job)을 대리로, 
-- 연봉(sal)을 1000으로, 부서를 영업부로 바꾸는 SQL문을 작성하시오.
SELECT *
FROM dept
WHERE dname = '영업부';
UPDATE emp SET job = '대리', sal = 1000, deptno = 30
-- select * from emp <--select 까지만 실행하면 송중기 데이터조회  update까지 실행하면 select는 주석이므로 상관 x
WHERE ename = '송중기';
SELECT *
FROM emp
WHERE ename = '송중기';

-- emp 테이블에서 영업부(deptno=30) 소속의 과장 송혜교의 
-- 연봉(sal)을 700으로, 커미션(comm)을 null로 수정하는 SQL문을 작성하시오.
-- select * from emp
WHERE job = '과장' AND deptno = 30 AND ename = '송혜교';
UPDATE emp SET sal = 700, comm = NULL
WHERE deptno= 30;

-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
-- DELETE 의 기본 사용 방법
-- DELETE : 데이터 삭제
-- DELETE FROM 테이블명
--  WHERE 조건식
-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2

-- dept에서 홍보팀을 삭제하시오.
DELETE
FROM dept
-- select * from dept
WHERE dname = '홍보팀';

-- emp에서 송중기와 송혜교를 삭제하시오.
DELETE
FROM emp
-- select * from emp
WHERE ename IN('송중기', '송혜교');


-- 문제 emp 테이블에서 직급(job)이 정해지지 않은 직원을 삭제하시오.
DELETE
FROM emp
-- select * from emp
WHERE job = '' OR job IS NULL;

-- 문제 emp 테이블에서 경리부에 소속된 사원들만 삭제하시오.
-- 1. SQL 변수를 이용하는 방법 : MySQL만 가능
SELECT @deptno := deptno
FROM dept
WHERE dname = '경리부' ;
SELECT *
FROM emp
WHERE deptno = @deptno;
DELETE
FROM emp
WHERE deptno = @deptno;
SELECT *
FROM emp
WHERE deptno = @deptno;

-- 2. 서브쿼리를 이용하는 방법 : MySQL, Oracle 가능, 추천하는 방법.
-- dept 테이블에서 경리부(dname)인 부서번호(deptno)를 출력하시오
-- emp 테이블에서 deptno = 10인 직원만 출력하시오
SELECT deptno
FROM dept
WHERE dname = '경리부';
SELECT *
FROM emp
WHERE deptno = 10;
DELETE
FROM emp
-- select * from emp
SELECT *
FROM emp
WHERE deptno = (
SELECT deptno
FROM dept
WHERE dname = '경리부'); -- 위에 두 문장을 하나로 합침. 


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
select ename, sal, case when job='부장' then sal*(1+0.05)
								when job='과장' then sal*(1+0.10)
								when job='대리' then sal*(1+0.15)
								when job='사원' then sal*(1+0.20) 
								end 인상급여
from emp;

update emp
set sal = case when job='부장' then sal*(1+0.05)
								when job='과장' then sal*(1+0.10)
								when job='대리' then sal*(1+0.15)
								when job='사원' then sal*(1+0.20) 
								end 

;

select * from emp;

-- 미션 2. 급여(sal)가 500이상인 직원만 급여를 10% 인상하도록 수정하시오.
update emp
set sal = sal*(1+0.1)
select *, sal*(1+01) from emp -- 주석 처리 풀었음. 
where sal >= 500;


-- 미션 3. 2005년에 입사한 모든 직원의 입사일을 오늘 날짜로 수정하시오.
# date의 값을 문자로 변환
-- MySQL : convert(컬럼명, 'yyyy')
# Oracle : to_char(컬럼명, 'yyyy')

update emp
set hiredate = curdate()
# select * from emp
where substring (hiredate, 1, 4) ='2005';
# where empno in (1003, 1005, 1010);
select * from emp
where empno in (1003, 1005, 1010);

-- 미션 4. 50번 부서의 부서의 위치(loc)를 40번 부서의 위치(loc)로 바꾸시오.
-- 용인에 있는 개발팀을 수원으로 옮긴다.
-- 서브쿼리를 사용하시오.
select loc from dept where deptno = 40;

update dept
set loc = '수원'
-- select * from dept
where deptno = 31;

update dept
set loc = (select loc from dept where deptno = 40);
-- select * from dept
where deptno = 31;

-- 미션 5. emp 테이블에서 급여가 500미만인 사원들의 급여를 50%씩 인상(업데이트)하시오.
update emp
set sal = sal + sal*0.5
mysql
-- select * from emp
where sal < 500;


-- 미션 6. emp 테이블에 아이린 과 강민경, 이해리 를 추가하시오. 
-- MySQL : sql 변수를 사용. insert 내에서 서브쿼리 지원하지 않음.
-- Oracle = 서브쿼리를 사용
select @maxemp := max(empno) from emp;
insert into emp( empno, ename) values(@maxemp + 1, '아이린');
insert into emp( empno, ename) values(@maxemp + 2, '강민경');
insert into emp( empno, ename) values(@maxemp + 3, '이해리');


-- 미션 7. emp 테이블에서 직급(job)이 정해지지 않은 직원을 삭제하시오.
delete from emp
-- select * from emp
where job = '' or job is null;

-- 미션 8. emp 테이블에서 경리부에 소속된 사원들만 삭제하시오.
select * from dept where dname ='경리부';
select * from emp where deptno = 10;

delete from emp
-- select * from emp 
where deptno = (select deptno from dept where dname ='경리부');

-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
-- 데이터 MERGE 하기.
-- MERGE 기본 문법
-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
-- 50번 부서의 사원(job) 송중기를 insert나 update하는 merge 문을 작성하시오.
select @empno := max(empno) from emp;
select * from emp where empno = @empno;

insert into emp (empno, ename, deptno, job)
				values(@empno   ,'송중기', 50, '사원') -- 여기까지만 실행하면 duplicate 오류.  중복오류임.
on duplicate key
update ename = '송중기', deptno=50, job='사원' -- emp set	은 merge구문에서 사용하지 않음.


select * from emp where empno = @empno;
















