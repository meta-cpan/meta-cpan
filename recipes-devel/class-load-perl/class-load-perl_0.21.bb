DESCRIPTION = ""require EXPR" only accepts "Class/Name.pm" style module names, not \
"Class::Name". How frustrating! For that, we provide "load_class \
'Class::Name'"."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Class-Load"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS += "data-optlist-perl"
DEPENDS += "module-implementation-perl"
DEPENDS += "module-runtime-perl"
DEPENDS += "package-stash-perl"
DEPENDS += "try-tiny-perl"

SRC_URI = "http://cpan.metacpan.org/authors/id/E/ET/ETHER/Class-Load-0.21.tar.gz"

SRC_URI[md5sum] = "67674318b7b47b519abfd9f16292dc35"
SRC_URI[sha256sum] = "10d9bae402f7e67ef441af1d7222c9d09c2b0818b81c6752c383a2d924c8047c"

S = "${WORKDIR}/Class-Load-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
