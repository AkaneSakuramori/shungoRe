.class public abstract Le3/c;
.super Le3/a;
.source "SourceFile"


# instance fields
.field public final c:Lc3/k;

.field public transient d:Lc3/e;


# direct methods
.method public constructor <init>(Lc3/e;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Lc3/e;->g()Lc3/k;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0}, Le3/c;-><init>(Lc3/e;Lc3/k;)V

    return-void
.end method

.method public constructor <init>(Lc3/e;Lc3/k;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Le3/a;-><init>(Lc3/e;)V

    iput-object p2, p0, Le3/c;->c:Lc3/k;

    return-void
.end method


# virtual methods
.method public final g()Lc3/k;
    .locals 1

    iget-object v0, p0, Le3/c;->c:Lc3/k;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final i()V
    .locals 3

    iget-object v0, p0, Le3/c;->d:Lc3/e;

    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    iget-object v1, p0, Le3/c;->c:Lc3/k;

    invoke-static {v1}, Lc3/h;->X(Ljava/lang/Object;)V

    sget-object v2, Lc3/f;->b:Lc3/f;

    invoke-interface {v1, v2}, Lc3/k;->e(Lc3/j;)Lc3/i;

    move-result-object v1

    invoke-static {v1}, Lc3/h;->X(Ljava/lang/Object;)V

    check-cast v1, Lc3/g;

    check-cast v0, Lkotlinx/coroutines/internal/c;

    :cond_0
    sget-object v0, Le3/b;->b:Le3/b;

    iput-object v0, p0, Le3/c;->d:Lc3/e;

    return-void
.end method
