.class public abstract Lr2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lo2/g;->a:I

    const/16 v1, 0x9

    if-ge v0, v1, :cond_0

    new-instance v0, Lr2/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, Lr2/c;

    invoke-direct {v0}, Lr2/c;-><init>()V

    :goto_0
    sput-object v0, Lr2/b;->a:Lr2/b;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/reflect/AccessibleObject;)V
.end method
