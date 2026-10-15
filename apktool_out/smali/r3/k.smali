.class public abstract Lr3/k;
.super Lc3/a;
.source "SourceFile"

# interfaces
.implements Lc3/g;


# static fields
.field public static final c:Lr3/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr3/j;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lr3/j;-><init>(II)V

    sput-object v0, Lr3/k;->c:Lr3/j;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lc3/f;->b:Lc3/f;

    invoke-direct {p0, v0}, Lc3/a;-><init>(Lc3/j;)V

    return-void
.end method


# virtual methods
.method public C()Z
    .locals 1

    instance-of v0, p0, Lr3/x0;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final e(Lc3/j;)Lc3/i;
    .locals 3

    const-string v0, "key"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, p1, Lc3/b;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lc3/b;

    iget-object v1, p0, Lc3/a;->b:Lc3/j;

    invoke-static {v1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    if-eq v1, p1, :cond_0

    iget-object v0, p1, Lc3/b;->c:Lc3/j;

    if-ne v0, v1, :cond_2

    :cond_0
    invoke-virtual {p1, p0}, Lc3/b;->a(Lc3/i;)Lc3/i;

    move-result-object p1

    instance-of v0, p1, Lc3/i;

    if-eqz v0, :cond_2

    move-object v2, p1

    goto :goto_0

    :cond_1
    sget-object v0, Lc3/f;->b:Lc3/f;

    if-ne v0, p1, :cond_2

    move-object v2, p0

    :cond_2
    :goto_0
    return-object v2
.end method

.method public final t(Lc3/j;)Lc3/k;
    .locals 3

    const-string v0, "key"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, p1, Lc3/b;

    sget-object v2, Lc3/l;->b:Lc3/l;

    if-eqz v1, :cond_2

    check-cast p1, Lc3/b;

    iget-object v1, p0, Lc3/a;->b:Lc3/j;

    invoke-static {v1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    if-eq v1, p1, :cond_0

    iget-object v0, p1, Lc3/b;->c:Lc3/j;

    if-ne v0, v1, :cond_1

    :cond_0
    invoke-virtual {p1, p0}, Lc3/b;->a(Lc3/i;)Lc3/i;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, p0

    goto :goto_0

    :cond_2
    sget-object v0, Lc3/f;->b:Lc3/f;

    if-ne v0, p1, :cond_1

    :goto_0
    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lr3/q;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract z(Lc3/k;Ljava/lang/Runnable;)V
.end method
