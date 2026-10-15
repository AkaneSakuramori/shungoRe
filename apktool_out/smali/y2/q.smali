.class public abstract Ly2/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroid/os/Handler;

.field public static final b:Lj/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Ly2/q;->a:Landroid/os/Handler;

    new-instance v0, Lj/a;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lj/a;-><init>(I)V

    sput-object v0, Ly2/q;->b:Lj/a;

    return-void
.end method
