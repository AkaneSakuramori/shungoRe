.class public final Lc3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc3/k;
.implements Ljava/io/Serializable;


# static fields
.field public static final b:Lc3/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc3/l;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lc3/l;->b:Lc3/l;

    return-void
.end method


# virtual methods
.method public final e(Lc3/j;)Lc3/i;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final h(Ljava/lang/Object;Lj3/p;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method public final hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final t(Lc3/j;)Lc3/k;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EmptyCoroutineContext"

    return-object v0
.end method

.method public final x(Lc3/k;)Lc3/k;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
