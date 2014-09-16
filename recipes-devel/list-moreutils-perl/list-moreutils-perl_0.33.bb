DESCRIPTION = "List::MoreUtils provides some trivial but commonly needed functionality \
on lists which is not going to go into List::Util."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/List-MoreUtils"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AD/ADAMK/List-MoreUtils-0.33.tar.gz"

SRC_URI[md5sum] = "8a33c84028cc2ff3e92c92434b326c0f"
SRC_URI[sha256sum] = "315c0b444c22b7bf207ac3c7e651d102c84a2308bfafb7a7efe095a9219494ad"

S = "${WORKDIR}/List-MoreUtils-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
