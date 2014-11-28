DESCRIPTION = "This is the \"Class::Singleton\" module. A Singleton describes an \
object class that can have only one instance in any system. An example \
of a Singleton \
might be a print spooler or system registry. This module implements a \
Singleton class from which other classes can be derived. By itself, the \
\"Class::Singleton\" module does very little other than manage the \
instantiation of a single object. In deriving a class from \
\"Class::Singleton\", your module will inherit the Singleton \
instantiation \
method and can implement whatever specific functionality is required."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Class-Singleton"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHAY/Class-Singleton-1.5.tar.gz"

SRC_URI[md5sum] = "6a2524f590eda075f4bc929598119241"
SRC_URI[sha256sum] = "38220d04f02e3a803193c2575a1644cce0b95ad4b95c19eb932b94e2647ef678"

S = "${WORKDIR}/Class-Singleton-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
