.class public final Landroidx/activity/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/activity/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/activity/w;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/activity/w;->a:Landroidx/activity/w;

    return-void
.end method


# virtual methods
.method public final a(Lj3/l;Lj3/l;Lj3/a;Lj3/a;)Landroid/window/OnBackInvokedCallback;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj3/l;",
            "Lj3/l;",
            "Lj3/a;",
            "Lj3/a;",
            ")",
            "Landroid/window/OnBackInvokedCallback;"
        }
    .end annotation

    const-string v0, "onBackStarted"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackProgressed"

    invoke-static {p2, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackInvoked"

    invoke-static {p3, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackCancelled"

    invoke-static {p4, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/activity/v;

    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/activity/v;-><init>(Lj3/l;Lj3/l;Lj3/a;Lj3/a;)V

    return-object v0
.end method
