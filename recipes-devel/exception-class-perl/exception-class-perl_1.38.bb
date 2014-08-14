DESCRIPTION = "RECOMMENDATION 1: If you are writing modern Perl code with Moose or Moo \
I highly recommend using Throwable instead of this module."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Exception-Class"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Exception-Class-1.38.tar.gz"

SRC_URI[md5sum] = "4d7203a95893449f53ccacb385981569"
SRC_URI[sha256sum] = "5c2cf90749c9f124118ad5846303c5463c9d6fa1f1c328a0085f6af2928c3900"
RDEPENDS_${PN} += "class-data-inheritable-perl"
RDEPENDS_${PN} += "devel-stacktrace-perl"

S = "${WORKDIR}/Exception-Class-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
