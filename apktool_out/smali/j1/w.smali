.class public final Lj1/w;
.super Lc3/h;
.source "SourceFile"


# static fields
.field public static final o:Ljava/lang/String;


# instance fields
.field public final j:Lf1/a;

.field public final k:Li1/a;

.field public final l:Z

.field public final m:Ljava/util/HashMap;

.field public final n:Lj1/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lj1/w;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lj1/w;->o:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lf1/a;Landroidx/fragment/app/k;Ljava/lang/String;Lj1/m;)V
    .locals 1

    const-string v0, "account"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctOptions"

    invoke-static {p4, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj1/w;->j:Lf1/a;

    iput-object p2, p0, Lj1/w;->k:Li1/a;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lj1/w;->l:Z

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lj1/w;->m:Ljava/util/HashMap;

    const-string p2, "returnTo"

    invoke-virtual {p1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p4, p0, Lj1/w;->n:Lj1/m;

    return-void
.end method


# virtual methods
.method public final J0(Lg1/c;)V
    .locals 1

    iget-object v0, p0, Lj1/w;->k:Li1/a;

    invoke-interface {v0, p1}, Li1/a;->a(Lf1/b;)V

    return-void
.end method

.method public final n2(Lj1/g;)Z
    .locals 3

    invoke-virtual {p1}, Lj1/g;->a()Z

    move-result p1

    iget-object v0, p0, Lj1/w;->k:Li1/a;

    if-eqz p1, :cond_0

    new-instance p1, Lg1/c;

    const-string v1, "a0.authentication_canceled"

    const-string v2, "The user closed the browser app so the logout was cancelled."

    invoke-direct {p1, v1, v2}, Lg1/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Li1/a;->a(Lf1/b;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-interface {v0, p1}, Li1/a;->b(Ljava/lang/Object;)V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method
