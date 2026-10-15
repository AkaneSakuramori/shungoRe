.class public abstract Le3/g;
.super Le3/c;
.source "SourceFile"

# interfaces
.implements Lk3/e;


# instance fields
.field public final e:I


# direct methods
.method public constructor <init>(Lc3/e;)V
    .locals 0

    invoke-direct {p0, p1}, Le3/c;-><init>(Lc3/e;)V

    const/4 p1, 0x2

    iput p1, p0, Le3/g;->e:I

    return-void
.end method


# virtual methods
.method public final d()I
    .locals 1

    iget v0, p0, Le3/g;->e:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Le3/a;->b:Lc3/e;

    if-nez v0, :cond_1

    sget-object v0, Lk3/n;->a:Lk3/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "kotlin.jvm.functions."

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x15

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    :cond_0
    const-string v1, "renderLambdaToString(this)"

    invoke-static {v0, v1}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-super {p0}, Le3/a;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
