.class public final Li0/z1;
.super Li0/y1;
.source "SourceFile"


# static fields
.field public static final q:Li0/c2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Li0/x;->g()Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Li0/c2;->g(Landroid/view/View;Landroid/view/WindowInsets;)Li0/c2;

    move-result-object v0

    sput-object v0, Li0/z1;->q:Li0/c2;

    return-void
.end method

.method public constructor <init>(Li0/c2;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li0/y1;-><init>(Li0/c2;Landroid/view/WindowInsets;)V

    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public f(I)Lb0/c;
    .locals 1

    iget-object v0, p0, Li0/u1;->c:Landroid/view/WindowInsets;

    invoke-static {p1}, Li0/b2;->a(I)I

    move-result p1

    invoke-static {v0, p1}, Li0/x;->e(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, Lb0/c;->c(Landroid/graphics/Insets;)Lb0/c;

    move-result-object p1

    return-object p1
.end method
