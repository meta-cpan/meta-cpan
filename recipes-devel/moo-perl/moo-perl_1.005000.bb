DESCRIPTION = ""Moo::Role" builds upon Role::Tiny, so look there for most of the \
documentation on how this works. The main addition here is extra bits \
to \
make the roles more "Moosey;" which is to say, it adds "has"."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Moo"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS += "class-method-modifiers-perl"
DEPENDS += "devel-globaldestruction-perl"
DEPENDS += "import-into-perl"
DEPENDS += "module-runtime-perl"
DEPENDS += "role-tiny-perl"
DEPENDS += "strictures-perl"

SRC_URI = "http://cpan.metacpan.org/authors/id/H/HA/HAARG/Moo-1.005000.tar.gz"

SRC_URI[md5sum] = "78f920761631450d9a905725968a501c"
SRC_URI[sha256sum] = "73865789520f1ab72518d3c712e79a33d283e4166be5e949bc23ab79a7184ea4"

S = "${WORKDIR}/Moo-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
