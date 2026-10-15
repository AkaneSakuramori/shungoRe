.class public final Li0/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/OnReceiveContentListener;


# instance fields
.field public final a:Li0/t;


# direct methods
.method public constructor <init>(Li0/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/s0;->a:Li0/t;

    return-void
.end method


# virtual methods
.method public final onReceiveContent(Landroid/view/View;Landroid/view/ContentInfo;)Landroid/view/ContentInfo;
    .locals 2

    new-instance v0, Li0/h;

    new-instance v1, Le/n0;

    invoke-direct {v1, p2}, Le/n0;-><init>(Landroid/view/ContentInfo;)V

    invoke-direct {v0, v1}, Li0/h;-><init>(Li0/g;)V

    iget-object v1, p0, Li0/s0;->a:Li0/t;

    check-cast v1, Lm0/u;

    invoke-virtual {v1, p1, v0}, Lm0/u;->a(Landroid/view/View;Li0/h;)Li0/h;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    if-ne p1, v0, :cond_1

    return-object p2

    :cond_1
    iget-object p1, p1, Li0/h;->a:Li0/g;

    invoke-interface {p1}, Li0/g;->r()Landroid/view/ContentInfo;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lc2/e;->g(Ljava/lang/Object;)Landroid/view/ContentInfo;

    move-result-object p1

    return-object p1
.end method
