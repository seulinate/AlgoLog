SELECT
    b.CATEGORY,sum(bs.SALES) as TOTAL_SALES
FROM book b
join BOOK_SALES bs
on b.BOOK_ID = bs.BOOK_ID
--where bs.sales_date like '2022-01%'
where TO_CHAR(bs.SALES_DATE,'YYYY-mm') = '2022-01'
group by b.CATEGORY
order by b.CATEGORY