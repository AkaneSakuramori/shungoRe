.class public final Lo2/q;
.super Lc3/h;
.source "SourceFile"


# instance fields
.field public final synthetic j:Ljava/lang/reflect/Method;

.field public final synthetic k:I


# direct methods
.method public constructor <init>(ILjava/lang/reflect/Method;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lo2/q;->j:Ljava/lang/reflect/Method;

    iput p1, p0, Lo2/q;->k:I

    return-void
.end method


# virtual methods
.method public final C1(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2

    invoke-static {p1}, Lc3/h;->K(Ljava/lang/Class;)V

    iget v0, p0, Lo2/q;->k:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lo2/q;->j:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
