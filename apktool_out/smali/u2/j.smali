.class public final Lu2/j;
.super Le3/g;
.source "SourceFile"

# interfaces
.implements Lj3/p;


# instance fields
.field public f:I

.field public final synthetic g:Lk3/m;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Lcom/shungo/app/InjectorService;


# direct methods
.method public constructor <init>(Lk3/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shungo/app/InjectorService;Lc3/e;)V
    .locals 0

    iput-object p1, p0, Lu2/j;->g:Lk3/m;

    iput-object p2, p0, Lu2/j;->h:Ljava/lang/String;

    iput-object p3, p0, Lu2/j;->i:Ljava/lang/String;

    iput-object p4, p0, Lu2/j;->j:Ljava/lang/String;

    iput-object p5, p0, Lu2/j;->k:Lcom/shungo/app/InjectorService;

    invoke-direct {p0, p6}, Le3/g;-><init>(Lc3/e;)V

    return-void
.end method


# virtual methods
.method public final a(Lc3/e;)Lc3/e;
    .locals 8

    new-instance v7, Lu2/j;

    iget-object v1, p0, Lu2/j;->g:Lk3/m;

    iget-object v2, p0, Lu2/j;->h:Ljava/lang/String;

    iget-object v3, p0, Lu2/j;->i:Ljava/lang/String;

    iget-object v4, p0, Lu2/j;->j:Ljava/lang/String;

    iget-object v5, p0, Lu2/j;->k:Lcom/shungo/app/InjectorService;

    move-object v0, v7

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lu2/j;-><init>(Lk3/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shungo/app/InjectorService;Lc3/e;)V

    return-object v7
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr3/o;

    check-cast p2, Lc3/e;

    invoke-virtual {p0, p2}, Lu2/j;->a(Lc3/e;)Lc3/e;

    move-result-object p1

    check-cast p1, Lu2/j;

    sget-object p2, Lz2/f;->a:Lz2/f;

    invoke-virtual {p1, p2}, Lu2/j;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Ld3/a;->b:Ld3/a;

    iget v1, p0, Lu2/j;->f:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lc3/h;->D2(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lc3/h;->D2(Ljava/lang/Object;)V

    sget-object p1, Lr3/x;->b:Lkotlinx/coroutines/scheduling/c;

    new-instance v1, Lu2/i;

    iget-object v4, p0, Lu2/j;->g:Lk3/m;

    iget-object v5, p0, Lu2/j;->h:Ljava/lang/String;

    iget-object v6, p0, Lu2/j;->i:Ljava/lang/String;

    iget-object v7, p0, Lu2/j;->j:Ljava/lang/String;

    iget-object v8, p0, Lu2/j;->k:Lcom/shungo/app/InjectorService;

    const/4 v9, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, Lu2/i;-><init>(Lk3/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shungo/app/InjectorService;Lc3/e;)V

    iput v2, p0, Lu2/j;->f:I

    invoke-static {p1, v1, p0}, Lc3/h;->L2(Lkotlinx/coroutines/scheduling/c;Lj3/p;Lc3/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lz2/f;->a:Lz2/f;

    return-object p1
.end method
